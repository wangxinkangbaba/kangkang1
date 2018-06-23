package com.example.dell.zhoukao3.model;

import com.example.dell.zhoukao3.app.APIFactory;
import com.example.dell.zhoukao3.app.AbstractObserver;
import com.example.dell.zhoukao3.bean.CarBean;
import com.example.dell.zhoukao3.view.MyViewCallBack;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by DELL on 2018/6/23.
 */

public class MyModel {

      public void select(final MyModelCallBack myModelCallBack){
          final Map<String,String> map=new HashMap<>();
          map.put("source","android");
          map.put("uid","1650");
          APIFactory.getInstance().select("/product/getCarts", map, new AbstractObserver<CarBean>() {
              @Override
              public void onSuccess(CarBean cartBean) {
                  myModelCallBack.success(cartBean);
              }

              @Override
              public void onFailure() {
                  myModelCallBack.failure();
              }
          });
      }
}
