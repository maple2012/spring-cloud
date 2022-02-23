package com.web.userservice.pojo;

import lombok.Data;

/**
 * @PackageName com.web.userservice.pojo
 * @ClassName User
 * @Description
 * @Author XuFeng
 * @Date 2022-02-23 22:17:14
 */
@Data
public class User {
    private Long id;
    private String username;
    private String address;
}
