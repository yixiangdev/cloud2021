package com.atguigu.springcloud.dao;

/**
 * @Package:
 * @FileName: TODO
 * @ClassName:
 * @Description:
 * @Author: 胡益祥
 * @CreateDate: 2021-02-26
 * @Version: v1.0
 */
//PaymentDao

import com.atguigu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PaymentDao {
    int create(Payment payment);

    Payment getPaymentById(@Param("id") Long id);
}

