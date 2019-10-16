package com.carson.gmall.bootuserserviceprovider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.carson.gmall.bean.UserAddress;
import com.carson.gmall.bootuserserviceprovider.service.UserService;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Service // 暴露服务
@Component
public class UserServiceImpl implements UserService {

    public List<UserAddress> getUserAddressList(String userId) {

        UserAddress address1 = new UserAddress(1, "河北省衡水市故城县西半屯镇", "1", "carson","12345678911","Y");
        UserAddress address2 = new UserAddress(1, "山东省德州市", "2", "eason", "4562144", "Y");

        return Arrays.asList(address1,address2);
    }
}
