package online.superh.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @version: 1.0
 * @author: haro
 * @description:
 * @date: 2023-10-09 14:49
 */
@SpringBootApplication
@EnableDiscoveryClient
public class AppUser {
    public static void main(String[] args) {
        SpringApplication.run(AppUser.class,args);
    }
}
