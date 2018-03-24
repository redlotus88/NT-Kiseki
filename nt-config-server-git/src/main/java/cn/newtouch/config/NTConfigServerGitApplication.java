package cn.newtouch.config;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Created by dragon on 2018/1/30.
 */
@EnableConfigServer
@EnableEurekaClient
@SpringBootApplication
public class NTConfigServerGitApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(NTConfigServerGitApplication.class).web(true).run(args);
    }
}
