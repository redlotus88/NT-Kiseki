package cn.newtouch;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * Created by dragon on 2018/3/8.
 */
@SpringBootApplication
@EnableZuulProxy
public class NTZuulServer {

    public static void main(String[] args) {
        new SpringApplicationBuilder(NTZuulServer.class).web(true).run(args);
    }

}
