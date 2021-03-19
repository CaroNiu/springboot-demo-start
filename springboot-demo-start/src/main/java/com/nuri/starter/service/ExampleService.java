package com.nuri.starter.service;

/**
 * 功能介绍：
 *  提供一个Service，包含一个能够将字符串加上前后缀方法
 * @author Nuri
 * @CreateTime 2021/3/19
 * @Describe
 */

public class ExampleService {

    private String prefix;
    private String suffix;

    public ExampleService(String prefix, String suffix) {
        this.prefix = prefix;
        this.suffix = suffix;
    }

    public String warp(String word){
        return prefix + word +suffix;
    }
}
