package com.bawei.mvpnew;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.bawei.mvpnew.mvp.presenter.PresenterIml;
import com.bawei.mvpnew.mvp.view.View;

public class MainActivity extends AppCompatActivity implements View {

    private PresenterIml presenterIml;
    private Handler handler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        presenterIml = new PresenterIml();
        presenterIml.attch(this);
        presenterIml.showData();
    }

    @Override
    public void success(String data) {
        handler.post(new Runnable() {
            @Override
            public void run() {




            }
        });

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        presenterIml.detch();
    }
}
