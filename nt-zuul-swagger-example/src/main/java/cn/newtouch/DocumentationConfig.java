package cn.newtouch;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import springfox.documentation.swagger.web.SwaggerResource;
import springfox.documentation.swagger.web.SwaggerResourcesProvider;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dragon on 2018/3/8.
 */
@Component
@Primary
public class DocumentationConfig implements SwaggerResourcesProvider {

    @Override
    public List<SwaggerResource> get() {
        List resources = new ArrayList<>();
        resources.add(swaggerResource("本项目文档大卵泡", "/v2/api-docs", "2.0"));
        resources.add(swaggerResource("Swagger Example API", "/doc/swagger-example/v2/api-docs", "2.0"));
        resources.add(swaggerResource("Eureka Client Example API", "/doc/eureka-client-example/v2/api-docs", "2.0"));
//        resources.add(swaggerResource("支付系统", "/pay/v2/api-docs", "2.0"));
        return resources;
    }

    private SwaggerResource swaggerResource(String name, String location, String version) {
        SwaggerResource swaggerResource = new SwaggerResource();
        swaggerResource.setName(name);
        swaggerResource.setLocation(location);
        swaggerResource.setSwaggerVersion(version);
        return swaggerResource;
    }
}
