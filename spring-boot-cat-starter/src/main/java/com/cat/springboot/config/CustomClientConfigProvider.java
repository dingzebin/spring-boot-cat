package com.cat.springboot.config;

import com.dianping.cat.configuration.ClientConfigProvider;
import com.dianping.cat.configuration.client.entity.ClientConfig;

/**
 * 自定义ClientConfigProvider
 */
public class CustomClientConfigProvider implements ClientConfigProvider {
    public ClientConfig getClientConfig() {
        ClientConfig clientConfig = new ClientConfig();
        clientConfig.setServers(CatClientProperties.getServers());
        clientConfig.setDomain(CatClientProperties.getDomain());
        clientConfig.setMode(CatClientProperties.getMode());
        return clientConfig;
    }
}
