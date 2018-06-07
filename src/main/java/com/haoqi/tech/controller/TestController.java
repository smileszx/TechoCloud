package com.haoqi.tech.controller;

import com.haoqi.tech.dto.TestDTO;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by suzhengxiao on 2018/6/7.
 */
@RestController
@EnableAutoConfiguration
public class TestController {

    @RequestMapping("/")
    public TestDTO getTestDTO () {
        TestDTO testDTO = new TestDTO();
        return testDTO;
    }
}
