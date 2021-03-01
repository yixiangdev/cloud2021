package springcloud;

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
public class PaymentMain8002 {

    private static final Logger logger = LoggerFactory.getLogger(PaymentMain8002.class);

    public static void main(String[] args){
        SpringApplication.run(PaymentMain8002.class,args);
        logger.info("PaymentMain8002 start success!");
    }

}
