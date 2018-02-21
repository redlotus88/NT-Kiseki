package cn.newtouch.jersey.config;

import cn.newtouch.jersey.service.Demo;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

/**
 * Created by dragon on 2018/2/13.
 */
@Component
public class JerseyConfig extends ResourceConfig {

    public JerseyConfig() {
        // 构造函数,在这里注册需要使用的内容,(过滤器,拦截器,API等)
        register(Demo.class);
    }
}
