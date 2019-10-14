package com.carson.gmall.service.impl;

import com.carson.gmall.bean.UserAddress;
import service.OrderService;
import service.UserService;

import java.util.List;

/**
 *  1. 将服务提供者注册到注册中心(暴漏服务)
 *      1) 导入 dubbo 依赖
 *      2) 配置服务提供者
 *
 *  2. 让服务消费者去注册中心订阅服务提供者的服务地址
 * */

public class OrderServiceImpl implements OrderService {

    UserService userService;

    public void initOrder(String userId) {
        // 1. 查询用户的收货地址
        List<UserAddress> userAddressList = userService.getUserAddressList(userId);
        System.out.println(userAddressList);
    }
}
