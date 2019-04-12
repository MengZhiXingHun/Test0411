package com.bawei.mvpnew.mvp.model;

/**
 * @作者 杜彬
 * @创建日期 2019/3/20
 */
public class ModelIml implements Model {

    @Override
    public void getData(HttpListener listener) {
        String name = "wahahahaha";

        listener.success(name);
    }
}
