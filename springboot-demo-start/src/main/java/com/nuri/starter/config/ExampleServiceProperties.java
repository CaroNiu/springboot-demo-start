package com.nuri.starter.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author Nuri
 * @CreateTime 2021/3/19
 * @Describe
 */
@ConfigurationProperties("example.service")
public class ExampleServiceProperties {
    private String prefix;
    private String suffix;

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }
}
