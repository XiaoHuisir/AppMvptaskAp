package com.example.a86066.appmvptaskap01.base;

public abstract class BasePresenter<M extends  BaseModel,V extends  BaseView>  {
    protected  M model;
    protected  V view;

    public void setModel(M model) {
        this.model = model;
    }

    public void setView(V view) {
        this.view = view;
    }
}
