package com.carson.gmall.bootuserserviceprovider.service;


import com.carson.gmall.bean.UserAddress;

import java.util.List;

public interface OrderService {

    /**
     *  初始化订单
     * */
    List<UserAddress> initOrder(String userId);
}
