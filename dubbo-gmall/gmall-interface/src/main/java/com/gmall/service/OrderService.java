package com.gmall.service;


import com.gmall.bean.UserAddress;

import java.util.List;

public interface OrderService {
    List<UserAddress> initOrder(String userId);

}
