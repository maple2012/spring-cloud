package com.web.orderservice.pojo;

import com.web.feignapi.pojo.User;
import lombok.Data;


/**
 * @PackageName com.web.orderservice.pojo
 * @ClassName Order
 * @Description
 * @Author XuFeng
 * @Date 2022-02-23 21:23:49
 */

@Data
public class Order {
    private Long id;
    private Long price;
    private String name;
    private Integer num;
    private Long userId;
    private User user;
}
