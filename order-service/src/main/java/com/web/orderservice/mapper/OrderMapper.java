package com.web.orderservice.mapper;


import com.web.orderservice.pojo.Order;
import org.apache.ibatis.annotations.Select;

/**
 * @PackageName com.web.orderservice.mapper
 * @ClassName OrderMapper
 * @Description
 * @Author XuFeng
 * @Date 2022-02-23 21:16:20
 */
public interface OrderMapper {
    @Select("select * from tb_order where id = #{id}")
    Order findById(Long id);
}
