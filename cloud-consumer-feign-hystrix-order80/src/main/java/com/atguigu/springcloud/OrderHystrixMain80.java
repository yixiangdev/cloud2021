package com.atguigu.springcloud;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @program: com-hyx-cloud2021
 * @Description:
 * @Author: hyx
 * @CreateDate: 2021-03-03  10:28
 */
@SpringBootApplication
@EnableFeignClients
public class OrderHystrixMain80 {

    private static final Logger logger = LoggerFactory.getLogger(OrderHystrixMain80.class);

    public static void main(String[] args){
        SpringApplication.run(OrderHystrixMain80.class,args);
        logger.info("OrderHystrixMain80 start success!");
    }


}
