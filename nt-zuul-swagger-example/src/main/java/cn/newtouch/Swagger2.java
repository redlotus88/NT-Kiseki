package cn.newtouch;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Created by dragon on 2018/2/21.
 * <p>
 * 与启动程序同级
 */
@Configuration
@EnableSwagger2
public class Swagger2 {
    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                    .apiInfo(apiInfo())
                    .select()
                    .apis(RequestHandlerSelectors.basePackage("cn.newtouch"))
                    .paths(PathSelectors.any())
                    .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("NT-Kiseki框架中使用Swagger2构建RESTful APIs")
                .description("NT Kiseki 框架下使用Spring Zuul结合Swagger2 构建统一的RESTful APIs站点")
                .termsOfServiceUrl("http://kiseki1029.com")
                .contact(new Contact("Dragon", "http://kiseki1029.com", "wangjialong02@163.com"))
                .version("1.0")
                .build();
    }

}
