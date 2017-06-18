package com.example.bookhsu.myapplication.view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.example.bookhsu.myapplication.R;
import com.example.bookhsu.myapplication.presenter.LoginPresenter;

/**
 * Created by bookhsu on 2017/4/9.
 */

public class MainActivity2 extends AppCompatActivity implements ILoginView {
    LoginPresenter loginPresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loginPresenter = new LoginPresenter(this);
    }

    @Override
    public void showLoginSuccess() {

    }

    @Override
    public void showLoginFail() {

    }
}
