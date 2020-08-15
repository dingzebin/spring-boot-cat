package com.cat.springboot.autoconfigure;

import com.cat.springboot.config.CatClientProperties;
import com.dianping.cat.Cat;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnProperty(prefix = "cat", name = "enable", havingValue = "true", matchIfMissing = true)
@EnableConfigurationProperties({CatClientProperties.class})
public class CatClientAutoConfiguration {
    /**
     * 初始化cat
     */
    public CatClientAutoConfiguration(CatClientProperties catClientProperties) {
        Cat.initialize();
    }
}

