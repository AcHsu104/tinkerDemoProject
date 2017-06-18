package com.example.bookhsu.myapplication.view;

/**
 * Created by bookhsu on 2017/4/9.
 */

public interface BaseView<T> {
    void setPresenter(T presenter);

    void showDialog(boolean isShow);
}
