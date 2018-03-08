package cn.stsniper.eureka.example;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by dragon on 2018/1/30.
 *
 * PiW eureka client example
 */
@Api(tags="Eureka Client", description = "DC Eureka测试类")
@RestController
public class DcController {

    @Autowired
    DiscoveryClient discoveryClient;

    @ApiOperation(value = "测试客户端连接", notes = "")
    @GetMapping("/dc")
    public String dc() {
        String services = "Services: " + discoveryClient.getServices();
        System.out.println(services);
        return services;
    }
}
