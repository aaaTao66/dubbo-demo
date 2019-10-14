package com.carson.gmall.service.impl;

import com.carson.gmall.bean.UserAddress;
import service.UserService;

import java.util.Arrays;
import java.util.List;

public class UserServiceImpl implements UserService {

    public List<UserAddress> getUserAddressList(String userId) {

        UserAddress address1 = new UserAddress(1, "河北省衡水市故城县西半屯镇", "1", "carson","12345678911","Y");
        UserAddress address2 = new UserAddress(1, "山东省德州市", "2", "eason", "4562144", "Y");

        return Arrays.asList(address1,address2);
    }
}
