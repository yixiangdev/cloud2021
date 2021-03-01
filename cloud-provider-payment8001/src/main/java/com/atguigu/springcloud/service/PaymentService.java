package com.atguigu.springcloud.service;

/**
 * @Package:
 * @FileName: TODO
 * @ClassName:
 * @Description:
 * @Author: 胡益祥
 * @CreateDate: 2021-02-26
 * @Version: v1.0
 */
//PaymentService


import com.atguigu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;
public interface PaymentService {
    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}

