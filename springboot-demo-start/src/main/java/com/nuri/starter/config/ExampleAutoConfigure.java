package com.nuri.starter.config;

import com.nuri.starter.service.ExampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 自动注入和兴配置类
 * @author Nuri
 * @CreateTime 2021/3/19
 * @Describe
 */
@Configuration
@ConditionalOnClass(ExampleService.class)
@EnableConfigurationProperties(ExampleServiceProperties.class)
public class ExampleAutoConfigure {

    @Autowired
    private ExampleServiceProperties exampleServiceProperties;

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(prefix = "example.service",value = "enable",havingValue = "true")
    public ExampleService exampleService(){
        return new ExampleService(exampleServiceProperties.getPrefix(),exampleServiceProperties.getSuffix());
    }


}
