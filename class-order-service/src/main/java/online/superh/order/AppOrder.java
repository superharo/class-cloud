package online.superh.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @version: 1.0
 * @author: haro
 * @description:
 * @date: 2023-10-09 14:48
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class AppOrder {
    public static void main(String[] args) {
        SpringApplication.run(AppOrder.class,args);
    }
}
