package cn.stsniper.eureka.example;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created by dragon on 2018/1/30.
 */
@EnableDiscoveryClient
@SpringBootApplication
public class ClientExampleApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(ClientExampleApplication.class).web(true).run(args);
    }
}
