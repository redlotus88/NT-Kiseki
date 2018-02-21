package cn.newtouch.jersey.service;

import cn.newtouch.jersey.bean.City;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by dragon on 2018/2/13.
 */
@Component
@Path("/demo")
public class Demo {

    @ApiOperation(value = "创建用户", notes = "根据User对象创建用户")
    @ApiImplicitParam(name = "user", value = "用户详细实体user", required = true, dataType = "User")
    @Path("/city")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public City get() {
        City city = new City();
        city.setId(1L);
        city.setCityName("beijing");
        city.setCityCode("001");
        System.out.println(city);
        return city;
    }

}
