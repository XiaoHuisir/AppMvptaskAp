package com.example.a86066.appsackday03;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

public class imageActivity extends AppCompatActivity {

    private ImageView mImageviewactivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image);
        initView();
    }

    private void initView() {
        mImageviewactivity = (ImageView) findViewById(R.id.imageviewactivity);
    }
}
