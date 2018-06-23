package com.example.dell.zhoukao3.presenter;

import com.example.dell.zhoukao3.bean.DeleteBean;
import com.example.dell.zhoukao3.model.MyModel2;
import com.example.dell.zhoukao3.model.MyModelCallBack2;
import com.example.dell.zhoukao3.view.MyViewCallBack2;

/**
 * Created by DELL on 2018/6/23.
 */

public class MyPresenter2 {
    MyModel2 myModel2;
    MyViewCallBack2 myViewCallBack2;
    public MyPresenter2(MyViewCallBack2 myViewCallBack2) {
        this.myViewCallBack2 = myViewCallBack2;
        this.myModel2 = new MyModel2();
    }


    public void delete(String pid) {
        myModel2.delete(pid,new MyModelCallBack2() {
            @Override
            public void success(DeleteBean deleteBean) {
                myViewCallBack2.success(deleteBean);
            }

            @Override
            public void failure() {
                myViewCallBack2.failure();
            }
        });
    }

    public void detach() {
        this.myViewCallBack2 = null;
    }
}
