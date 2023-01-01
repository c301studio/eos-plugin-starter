package com.c301.modules.controller;

import com.c301.modules.plugin.base.annotation.ApiVersion;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;
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
@Controller
@ApiVersion(value = "/ap1")
@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping("/hello-world")
    public String hello() {
        return "Hello world";
    }

    @GetMapping("/{say}")
    public String say(@PathVariable("say") String say) {
        return say;
    }

    @GetMapping("/file")
    public Resource hello1() {
        return new FileSystemResource("D:/图片/EC83488719EDDFF991B94A75761DBD19.jpg");
    }

}
