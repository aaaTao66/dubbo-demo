package com.carson.gmall.service;


import com.carson.gmall.bean.UserAddress;

import java.util.List;

/**
 *  用户服务接口
 * */
public interface UserService {

    /*
    按照用户id返回所有收获地址
    * */
    List<UserAddress> getUserAddressList(String userId);
}
