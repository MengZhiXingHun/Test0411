package com.bawei.mvpnew.mvp.presenter;

import com.bawei.mvpnew.mvp.view.View;

/**
 * @作者 杜彬
 * @创建日期 2019/3/20
 */
public interface Presenter {

    void attch(View view);
    void showData();
    void detch();

}
