package cn.rdlts.jersey.service;

import cn.rdlts.jersey.bean.City;
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
