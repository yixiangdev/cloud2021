package com.atguigu.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @Package:
 * @FileName: TODO
 * @ClassName:
 * @Description:
 * @Author: 胡益祥
 * @CreateDate: 2021-03-02
 * @Version: v1.0
 */
public interface LoadBalancer {

    public ServiceInstance instances(List<ServiceInstance> serviceInstances);


}
