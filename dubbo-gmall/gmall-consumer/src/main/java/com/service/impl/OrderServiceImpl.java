package com.service.impl;

import com.gmall.bean.UserAddress;
import com.gmall.service.OrderService;
import com.gmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    UserService userService;

    public List<UserAddress> initOrder(String userId) {
        System.out.println("用户id == "+userId);
        List<UserAddress> userAddressList = userService.getUserAddress(userId);

        for(UserAddress userAddress : userAddressList){
            System.out.println(userAddress.toString());
        }

        return userAddressList;
    }
}
