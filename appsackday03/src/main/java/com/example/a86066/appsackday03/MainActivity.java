package com.example.a86066.appsackday03;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.example.a86066.appsackday03.adaptter.Cycler;
import com.example.a86066.appsackday03.api.Mainserver;
import com.example.a86066.appsackday03.dean.Userbean;

import java.util.List;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mRecycler;
    private LinearLayout mZhu;
    private DrawerLayout mDrawer;
    private NavigationView mNavig;
    private Toolbar mBar;
    private ImageView image;

    //张慧  H1812B
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        mRecycler = (RecyclerView) findViewById(R.id.recycler);
        mZhu = (LinearLayout) findViewById(R.id.Zhu);
        mDrawer = (DrawerLayout) findViewById(R.id.drawer);
        mNavig = (NavigationView) findViewById(R.id.navig);
        mBar = (Toolbar) findViewById(R.id.bar);
        LinearLayoutManager layout = new LinearLayoutManager(this);
        layout.setOrientation(LinearLayoutManager.HORIZONTAL); //设置方向
        mRecycler.setLayoutManager(layout);
        initdate();
        initlist();
    }

    private void initlist() {
        Observable<Userbean> getsetver = new Retrofit.Builder()
                .baseUrl(Mainserver.Baseurl)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build().create(Mainserver.class).getsetver();
        getsetver.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<Userbean>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(Userbean userbean) {
                        List<Userbean.ResultsBean> list = userbean.getResults();
                        //创建适配器
                        Cycler cycler = new Cycler(list, MainActivity.this);
                        //绑定适配器
                        mRecycler.setAdapter(cycler);

                    }

                    @Override
                    public void onError(Throwable e) {
                        Toast.makeText(MainActivity.this, "请求失败", Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }

    private void initdate() {
        mBar.setTitle(null);
        registerForContextMenu(mBar);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, mDrawer, mBar, R.string.app_name, R.string.app_name);
        mDrawer.addDrawerListener(toggle);
        toggle.syncState();
        initinset();
    }

    private void initinset() {
        mDrawer.addDrawerListener(new DrawerLayout.SimpleDrawerListener() {
            @Override
            public void onDrawerSlide(View drawerView, float slideOffset) {
                super.onDrawerSlide(drawerView, slideOffset);
                mZhu.setX(mNavig.getWidth()*slideOffset);
            }
        });
        View view = mNavig.getHeaderView(0);
        image = view.findViewById(R.id.imageviewheadler);
        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
        startActivity(new Intent(MainActivity.this,imageActivity.class));
            }
        });
    }
}
