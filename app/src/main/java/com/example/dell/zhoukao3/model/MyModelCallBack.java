package com.example.dell.zhoukao3.model;

import com.example.dell.zhoukao3.bean.CarBean;

/**
 * Created by DELL on 2018/6/23.
 */

public interface MyModelCallBack {
    public void success(CarBean cartBean);
    public void failure();
}
