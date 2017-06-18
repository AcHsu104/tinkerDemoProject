package com.example.bookhsu.myapplication.presenter;

import com.example.bookhsu.myapplication.contract.LoginContract;

/**
 * Created by bookhsu on 2017/4/9.
 */

public class LoginPresentWithContract implements LoginContract.Presenter{

    LoginContract.View loginView;

    public LoginPresentWithContract(LoginContract.View loginView){
        this.loginView = loginView;
        loginView.setPresenter(this);
    }

    @Override
    public void loginSuccess() {
        loginView.showDialog(true);
    }

    @Override
    public void loginFail() {
        loginView.showDialog(false);
    }
}
