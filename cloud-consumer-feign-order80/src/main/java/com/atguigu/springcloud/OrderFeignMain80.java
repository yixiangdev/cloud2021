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
 * @CreateDate: 2021-03-02  15:04
 */
@SpringBootApplication
@EnableFeignClients
public class OrderFeignMain80 {


    private static final Logger logger = LoggerFactory.getLogger(OrderFeignMain80.class);

    public static void main(String[] args){
        SpringApplication.run(OrderFeignMain80.class,args);
        logger.info("OrderFeignMain80 start success!");
    }

}
