package cn.rdlts.eureka;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by dragon on 2018/3/25.
 */
@SpringBootApplication
@EnableEurekaServer
public class NTEurekaServerClusterApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(NTEurekaServerClusterApplication.class)
                .web(true).run(args);
    }
}
