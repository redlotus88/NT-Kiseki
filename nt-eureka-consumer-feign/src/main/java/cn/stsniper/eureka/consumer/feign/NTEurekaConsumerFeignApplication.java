package cn.stsniper.eureka.consumer.feign;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * Created by dragon on 2018/1/30.
 */
@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class NTEurekaConsumerFeignApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(NTEurekaConsumerFeignApplication.class).web(true).run(args);
    }
}
