package com.atguigu.springcloud.config;

import feign.Logger;
import org.springframework.context.annotation.Configuration;

/**
 * @program: com-hyx-cloud2021
 * @Description:
 * @Author: hyx
 * @CreateDate: 2021-03-02  16:21
 */
@Configuration
public class FeignConfig {

    Logger.Level feignLoggerLevel(){
        return Logger.Level.FULL;
    }

}
