package com.bawei.mvpnew.mvp.model;

/**
 * @作者 杜彬
 * @创建日期 2019/3/20
 */
public interface Model {

    void getData(HttpListener listener);

    interface HttpListener{
        void success(String data);
        void fail(Exception e);
    }

}
