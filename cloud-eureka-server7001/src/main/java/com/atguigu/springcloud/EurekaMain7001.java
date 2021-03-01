package com.atguigu.springcloud;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @program: com-hyx-cloud2021
 * @Description:
 * @Author: hyx
 * @CreateDate: 2021-03-01  11:01
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaMain7001 {

    private static final Logger logger = LoggerFactory.getLogger(EurekaMain7001.class);

    public static void main(String[] args){
        SpringApplication.run(EurekaMain7001.class,args);
        logger.info("EurekaMain7001 start success!");
    }

}
