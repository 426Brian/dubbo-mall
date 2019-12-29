package com.service.impl;

import com.gmall.bean.UserAddress;
import com.gmall.service.UserService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UserServiceImpl implements UserService {

    public List<UserAddress> getUserAddress(String userId) {
        List<UserAddress> userAddressList = new ArrayList<UserAddress>();
        UserAddress userAddress1 = new UserAddress(1, "河北常山", "1", "赵云", "5446353", "yes");
        UserAddress userAddress2 = new UserAddress(2, "河北沧州", "2", "关兴", "16168435", "no");

        return Arrays.asList(userAddress1, userAddress2);
    }
}
