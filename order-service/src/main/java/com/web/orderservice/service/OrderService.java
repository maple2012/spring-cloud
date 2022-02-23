package com.web.orderservice.service;

import com.web.orderservice.mapper.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @PackageName com.web.orderservice.service
 * @ClassName OrderService
 * @Description
 * @Author XuFeng
 * @Date 2022-02-23 22:49:13
 */
@Service
public class OrderService {
    @Autowired
    private OrderMapper orderMapper;
}
