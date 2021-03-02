package com.atguigu.springcloud;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @program: com-hyx-cloud2021
 * @Description:
 * @Author: hyx
 * @CreateDate: 2021-03-02  17:50
 */
@SpringBootApplication
@EnableEurekaClient
public class PaymentHystrixMain8001 {

    private static final Logger logger = LoggerFactory.getLogger(PaymentHystrixMain8001.class);

    public static void main(String[] args){
        SpringApplication.run(PaymentHystrixMain8001.class,args);
        logger.info("PaymentHystrixMain8001 start success!");
    }
}
