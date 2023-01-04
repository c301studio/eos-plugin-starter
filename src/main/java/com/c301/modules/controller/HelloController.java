package com.c301.modules.controller;

import com.c301.modules.plugin.base.annotation.ApiVersion;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试接口
 *
 * @Title HelloController
 * @ClassName com.c301.modules.controller.HelloController
 * @Author Chenbing
 * @Date 2022/12/28 15:08
 * @Version 1.0
 **/
@Api(tags = "Hello接口")
@Controller
@ApiVersion(value = "/ap1")
@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping("/hello-world")
    @ApiOperation("普通接口")
    public String hello() {
        return "Hello world";
    }

    @GetMapping("/{say}")
    @ApiOperation("Say接口")
    public String say(@PathVariable("say") String say) {
        return say;
    }

}
