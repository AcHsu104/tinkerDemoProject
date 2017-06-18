package com.example.bookhsu.myapplication;

import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.example.bookhsu.myapplication.contract.LoginContract;
import com.example.bookhsu.myapplication.presenter.LoginPresentWithContract;
import com.tencent.tinker.lib.tinker.TinkerInstaller;

import java.io.File;

public class MainActivity extends AppCompatActivity implements LoginContract.View{

    LoginContract.Presenter mLoginPresentWithContract;
    TextView txtName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        mLoginPresentWithContract =
                new LoginPresentWithContract(this);

        txtName = (TextView)findViewById(R.id.txtName);
//        txtName.setText("version1");
        txtName.setText("version123 test andfix");

    }

    @Override
    public void setPresenter(LoginContract.Presenter presenter) {
        mLoginPresentWithContract = presenter;
    }

    @Override
    public void showDialog(boolean isShow) {

    }
}
