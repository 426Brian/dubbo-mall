package com.gmall.service;

import com.gmall.bean.UserAddress;

import java.util.List;

public interface UserService {
    List<UserAddress> getUserAddress(String userId);

}
