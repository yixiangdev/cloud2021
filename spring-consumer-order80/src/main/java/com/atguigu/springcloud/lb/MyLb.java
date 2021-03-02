package com.atguigu.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @program: com-hyx-cloud2021
 * @Description:
 * @Author: hyx
 * @CreateDate: 2021-03-02  14:21
 */
@Component
public class MyLb{

    private AtomicInteger atomicInteger=new AtomicInteger(0);

    public ServiceInstance instances(List<ServiceInstance> serviceInstances) {
        int index=getAndIncrement()%serviceInstances.size();
        return serviceInstances.get(index);
    }



    private final int getAndIncrement(){
        int current;
        int next;
        do{
            current=this.atomicInteger.get();
            next=current>=Integer.MAX_VALUE ? 0 :current+1;
        }while (!this.atomicInteger.compareAndSet(current,next));
        System.out.println("第几次："+next);
        return next;
    }
}
