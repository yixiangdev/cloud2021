package com.atguigu.springcloud.service;

/**
 * @program: com-hyx-cloud2021
 * @Description:
 * @Author: hyx
 * @CreateDate: 2021-02-26  15:28
 */

import com.atguigu.springcloud.dao.PaymentDao;
import com.atguigu.springcloud.entities.Payment;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
@Service
public class PaymentServiceImpl implements PaymentService{
    @Resource
    private PaymentDao paymentDao;

    public int create(Payment payment){
        return paymentDao.create(payment);
    }
    @Override
    public Payment getPaymentById(Long id){
        return paymentDao.getPaymentById(id);
    }
}

