package cn.stsniper.eureka;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by dragon on 2018/1/30.
 *
 * PiW eureka server.
 */

@EnableEurekaServer
@SpringBootApplication
public class NTEurekaServerApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(NTEurekaServerApplication.class)
                .web(true).run(args);
    }
}
