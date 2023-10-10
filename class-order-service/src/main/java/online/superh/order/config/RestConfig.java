package online.superh.order.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @version: 1.0
 * @author: haro
 * @description:
 * @date: 2023-10-10 11:16
 */
@Configuration
public class RestConfig {

    @Bean
    //默认集成Ribbon
    @LoadBalanced
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

}
