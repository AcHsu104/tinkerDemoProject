package com.example.bookhsu.myapplication.presenter;

import com.example.bookhsu.myapplication.view.ILoginView;

/**
 * Created by bookhsu on 2017/4/9.
 */

public class LoginPresenter implements ILoginPresenter {

    ILoginView loginView;

    public LoginPresenter(ILoginView loginView){
        this.loginView = loginView;
    }

    @Override
    public void loginSuccess() {

    }

    @Override
    public void loginFail() {

    }
}
