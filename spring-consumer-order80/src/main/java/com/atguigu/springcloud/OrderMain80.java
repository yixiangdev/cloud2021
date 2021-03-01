package com.atguigu.springcloud;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @program: com-hyx-cloud2021
 * @Description: 主启动类
 * @Author: hyx
 * @CreateDate: 2021-02-26  12:23
 */
@SpringBootApplication
@EnableEurekaClient
public class OrderMain80 {

    private static final Logger logger = LoggerFactory.getLogger(OrderMain80.class);

    public static void main(String[] args){
        SpringApplication.run(OrderMain80.class,args);
        logger.info("OrderMain80 start success!");
    }

}
