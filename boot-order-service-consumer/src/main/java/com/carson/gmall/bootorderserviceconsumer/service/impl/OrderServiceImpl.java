package com.carson.gmall.bootorderserviceconsumer.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.carson.gmall.bean.UserAddress;
import com.carson.gmall.bootuserserviceprovider.service.OrderService;
import com.carson.gmall.bootuserserviceprovider.service.UserService;
import com.sun.org.apache.bcel.internal.generic.RETURN;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 *  1. 将服务提供者注册到注册中心(暴漏服务)
 *      1) 导入 dubbo 依赖
 *      2) 配置服务提供者
 *
 *  2. 让服务消费者去注册中心订阅服务提供者的服务地址
 * */

@Service
public class OrderServiceImpl implements OrderService {

    /**
     *  @Reference: 远程调用UserService, 自己会去注册中心去发现
     * */
    @Reference
    UserService userService;

    public List<UserAddress> initOrder(String userId) {
        System.out.println("用户id:"+userId);
        // 1. 查询用户的收货地址
        List<UserAddress> userAddressList = userService.getUserAddressList(userId);
        return userAddressList;
    }
}
