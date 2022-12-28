package com.c301.modules;

import com.c301.modules.plugin.base.domain.BasePlugin;
import lombok.extern.slf4j.Slf4j;
import org.pf4j.PluginWrapper;
import org.springframework.stereotype.Component;

/**
 * 插件启动测试
 */
@Slf4j
@Component
public class StarterPlugin extends BasePlugin {

    public StarterPlugin(PluginWrapper wrapper) {
        super(wrapper);
    }

    @Override
    public void start() {
        log.info("插件启动！");
        System.out.println("插件启动！");
    }

    @Override
    public void stop() {
        log.info("插件停止！");
        System.out.println("插件停止！");
    }

    @Override
    public void delete() {
        log.info("插件删除！");
        System.out.println("插件删除！");
    }
}
