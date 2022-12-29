package com.c301.modules;

import com.c301.modules.plugin.base.domain.AbstractExtension;
import lombok.extern.slf4j.Slf4j;
import org.pf4j.Extension;

/**
 * 插件实现
 *
 * @Title PluginExtension
 * @ClassName com.c301.modules.PluginExtension
 * @Author Chenbing
 * @Date 2022/12/29 10:19
 * @Version 1.0
 **/
@Slf4j
@Extension
public class PluginExtension implements AbstractExtension {

    @Override
    public String helloWorld() {
        var value = "你好！";
        System.out.println("插件消息：你好！");
        return value;
    }

}
