package cn.rdlts.jersey;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * Created by dragon on 2018/2/13.
 */
@SpringBootApplication
public class JerseyExampleApplication {

    public static void main(String[] args) {
        // Spring boot 入口
        new SpringApplicationBuilder(JerseyExampleApplication.class).web(true).run(args);
    }
}
