package com.springboot.test.examplestart.comtroller;

import com.nuri.starter.service.ExampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author Nuri
 * @CreateTime 2021/3/19
 * @Describe
 */
@RestController
public class TestController {
    @Autowired
    private ExampleService exampleService;

    @GetMapping("/input/{word}")
    public String input(@PathVariable("word") String word){
        return exampleService.warp(word);
    }
}
