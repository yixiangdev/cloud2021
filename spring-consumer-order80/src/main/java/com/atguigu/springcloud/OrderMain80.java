package com.atguigu.springcloud;

import com.netflix.loadbalancer.RandomRule;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @program: com-hyx-cloud2021
 * @Description: 主启动类
 * @Author: hyx
 * @CreateDate: 2021-02-26  12:23
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
//将轮询方式修改为随即方式（name为服务名，指定那个服务用那种负载均衡策略）
@RibbonClient(name = "CLOUD-PAYMENT-SERVICE",configuration = RandomRule.class)
public class OrderMain80 {

    private static final Logger logger = LoggerFactory.getLogger(OrderMain80.class);

    public static void main(String[] args){
        SpringApplication.run(OrderMain80.class,args);
        logger.info("OrderMain80 start success!");
    }

}
