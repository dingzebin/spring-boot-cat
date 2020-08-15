package com.cat.springboot.config;

import com.dianping.cat.configuration.client.entity.Server;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;

@ConfigurationProperties(prefix = "cat")
public class CatClientProperties {
    /**
     * 模式
     */
    private static String mode = "client";
    /**
     * 显示的名称
     */
    private static String domain;

    /**
     * server地址，多个逗号隔开
     * 例：192.168.130.219:2280 不加端口默认2280
     */
    private static List<Server> servers;

    public static List<Server> getServers() {
        return servers;
    }

    public static String getDomain() {
        return domain;
    }
    public static String getMode() {
        return mode;
    }


    @Value("${spring.application.name:unkown}")
    public void setDomain(String domain) {
        this.domain = domain;
    }

    public void setServers(List<Server> servers) {
        this.servers = servers;
    }

    public void setMode(String mode) {
        if (mode == null) return;
        this.mode = mode;
    }

    @Override
    public String toString() {
        return "CatClientProperties [domain=" + domain + ", servers=" + servers + "]";
    }

}
