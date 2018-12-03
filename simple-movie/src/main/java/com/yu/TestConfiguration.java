package com.yu;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration  //注入spring容器
public class TestConfiguration {

    /**
     * 使用RandomRule负载均衡器覆盖默认的负载均衡器
     * @return
     */
    @Bean
    public IRule iRule(){
        return new RandomRule();
    }
}
