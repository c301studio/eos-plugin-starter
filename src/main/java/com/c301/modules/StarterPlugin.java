package com.c301.modules;

import com.c301.modules.plugin.base.domain.BasePlugin;
import lombok.extern.slf4j.Slf4j;
import org.pf4j.PluginWrapper;
import org.springframework.stereotype.Component;

/**
 * 插件入口
 *
 * @Author Chenbing
 **/
@Slf4j
@Component
public class StarterPlugin extends BasePlugin {

    public StarterPlugin(PluginWrapper wrapper) {
        super(wrapper);
    }

    @Override
    public void start() {
        log.debug("插件启动！");
    }

    @Override
    public void stop() {
        log.debug("插件停止！");
    }

    @Override
    public void delete() {
        log.debug("插件删除！");
    }
}
