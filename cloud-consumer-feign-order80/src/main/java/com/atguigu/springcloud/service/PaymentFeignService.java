package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entities.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @Package:
 * @FileName: TODO
 * @ClassName:
 * @Description:
 * @Author: 胡益祥
 * @CreateDate: 2021-03-02
 * @Version: v1.0
 */
@Component
@FeignClient(value = "CLOUD-PAYMENT-SERVICE") //添加@FeignClient注解,指定服务提供方服务名称
public interface PaymentFeignService {


    //OpenFeign支持Spring MVC注解,此处通过@GetMapping去调用 CLOUD-PAYMENT-SERVICE 该服务指定的接口
    @GetMapping(value = "/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id);//该接口声明必须和服务提供方一致
}
