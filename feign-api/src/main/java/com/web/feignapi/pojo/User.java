package com.web.feignapi.pojo;

import lombok.Data;

/**
 * @PackageName com.web.feignapi.pojo
 * @ClassName User
 * @Description
 * @Author XuFeng
 * @Date 2022-02-23 21:56:29
 */
@Data
public class User {
    private Long id;
    private String username;
    private String address;
}
