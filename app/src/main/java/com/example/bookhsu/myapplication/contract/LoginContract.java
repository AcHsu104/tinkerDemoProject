package com.example.bookhsu.myapplication.contract;

import com.example.bookhsu.myapplication.presenter.BasePresenter;
import com.example.bookhsu.myapplication.view.BaseView;

/**
 * Created by bookhsu on 2017/4/9.
 */

public interface LoginContract {
    interface View extends BaseView<Presenter>{

    }

    interface Presenter extends BasePresenter{
        void loginSuccess();
        void loginFail();
    }
}
