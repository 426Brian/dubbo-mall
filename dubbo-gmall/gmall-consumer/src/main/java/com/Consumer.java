package com;

import com.gmall.service.OrderService;
import com.gmall.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class Consumer {
    public static void main(String[] args) throws IOException {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("consumer.xml");

        OrderService orderService = (OrderService) applicationContext.getBean(OrderService.class);

        orderService.initOrder("1");

        System.in.read();
    }
}
