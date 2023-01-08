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
 * 这是一个接口开发的示例
 * 若您不需要接口则可以将该文件移除
 *
 * @Author Chenbing
 **/
@Api(tags = "Hello接口")
@Controller
@ApiVersion
@RestController
@RequestMapping("/hello")
public class DemoController {

    @GetMapping("/hello-world")
    @ApiOperation("测试接口 hello-world")
    public String hello() {
        return "Hello world";
    }

    @GetMapping("/{say}")
    @ApiOperation("测试接口 say")
    public String say(@PathVariable("say") String say) {
        return say;
    }

}
