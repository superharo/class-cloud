package online.superh.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
public class AppGateway
{


    public static void main( String[] args )
    {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(AppGateway.class, args);

        String haro = applicationContext.getEnvironment().getProperty("haro");
        System.out.println(haro);
    }
}
