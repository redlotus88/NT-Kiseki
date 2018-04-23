package com.newtouch.activemq;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * Created by dragon on 2018/4/23.
 */
@SpringBootApplication
public class ActiveMQExampleApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(ActiveMQExampleApplication.class).web(true).run(args);
    }
}
