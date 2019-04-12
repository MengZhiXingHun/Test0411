package com.bawei.mvpnew.mvp.presenter;

import com.bawei.mvpnew.mvp.model.Model;
import com.bawei.mvpnew.mvp.model.ModelIml;
import com.bawei.mvpnew.mvp.view.View;

/**
 * @作者 杜彬
 * @创建日期 2019/3/20
 */
public class PresenterIml implements Presenter {

    private ModelIml modelIml;
    View view;

    @Override
    public void attch(View view) {
        modelIml = new ModelIml();
        this.view = view;
    }

    @Override
    public void showData() {
        modelIml.getData(new Model.HttpListener() {
            @Override
            public void success(String data) {
                view.success(data);
            }

            @Override
            public void fail(Exception e) {

            }
        });
    }

    @Override
    public void detch() {
        if (view != null){
            view = null;
        }
        if (modelIml != null){
            modelIml = null;
        }
        System.gc();
    }
}
