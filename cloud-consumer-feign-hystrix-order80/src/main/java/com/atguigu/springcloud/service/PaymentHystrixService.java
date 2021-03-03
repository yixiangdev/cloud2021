package com.atguigu.springcloud.service;

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
//添加@FeignClient注解,指定服务提供方服务名称
@FeignClient(value = "cloud-payment-hystrix-payment",fallback = PaymentFallbackService.class)
public interface PaymentHystrixService {



    @GetMapping("/payment/hystrix/ok/{id}")
    public String paymentInfo_OK(@PathVariable("id") Integer id);

    @GetMapping("/payment/hystrix/timeout/{id}")
    public String paymentInfo_TimeOut(@PathVariable("id") Integer id);

}
