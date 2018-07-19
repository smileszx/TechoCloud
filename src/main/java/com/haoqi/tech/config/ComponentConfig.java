package com.haoqi.tech.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by suzhengxiao on 2018/6/12.
 */
@Configuration
@ComponentScan(basePackages= {"com.haoqi.tech.dto", "com.haoqi.tech.domain"} )
public class ComponentConfig {

}
