package com.haoqi.tech.controller;

import com.haoqi.tech.dto.TestDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by suzhengxiao on 2018/6/7.
 */
@RestController
@EnableAutoConfiguration
@Slf4j
public class TestController {

    @RequestMapping("/")
    public TestDTO getTestDTO () {
        TestDTO testDTO = new TestDTO();
        return testDTO;
    }


    private String getTest () {
        return "test";

    }

    @RequestMapping("/test")
    public TestDTO TestGit (){

        TestDTO testDTO = new TestDTO();
        log.info("Test" + testDTO);
        return testDTO;
    }
}
