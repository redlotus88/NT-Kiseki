package cn.newtouch.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dragon on 2018/3/8.
 */
@Api(tags = "Zuul Swagger Test 接口", description = "zuul")
@RestController
@RequestMapping(value = "/v1/test")
public class TestController {

    @ApiOperation(value = "Hello World test 接口", notes = "")
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String test() {
        return "hello world!";
    }
}
