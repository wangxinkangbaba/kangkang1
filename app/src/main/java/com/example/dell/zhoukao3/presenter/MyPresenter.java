package com.example.dell.zhoukao3.presenter;

import com.example.dell.zhoukao3.bean.CarBean;
import com.example.dell.zhoukao3.model.MyModel;
import com.example.dell.zhoukao3.model.MyModelCallBack;
import com.example.dell.zhoukao3.view.MyViewCallBack;

/**
 * Created by DELL on 2018/6/23.
 */

public class MyPresenter{
    MyModel myModel;
    MyViewCallBack myViewCallBack;
    public MyPresenter(MyViewCallBack myViewCallBack) {
        this.myViewCallBack = myViewCallBack;
        this.myModel = new MyModel();
    }


    public void select() {
        myModel.select(new MyModelCallBack() {
            @Override
            public void success(CarBean cartBean) {
                myViewCallBack.success(cartBean);
            }

            @Override
            public void failure() {
                myViewCallBack.failure();
            }
        });
    }

    public void detach() {
        this.myViewCallBack = null;
    }
}
