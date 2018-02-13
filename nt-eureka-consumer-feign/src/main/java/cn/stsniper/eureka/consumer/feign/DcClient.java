package cn.stsniper.eureka.consumer.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by dragon on 2018/1/30.
 */
@FeignClient("nt-eureka-client-example")
public interface DcClient {

    @GetMapping("/dc")
    String consumer();

}
