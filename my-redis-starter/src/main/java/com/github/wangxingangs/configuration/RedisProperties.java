package com.github.wangxingangs.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author ziyu
 * @date 2021/3/31 22:17
 */
@ConfigurationProperties(prefix = "redis.starter")
public class RedisProperties {

    private String host;
    private Integer port;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }
}
