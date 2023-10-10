package online.superh.video;

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
public class AppVideo {

    public static void main(String[] args) {
        SpringApplication.run(AppVideo.class,args);
    }

}
