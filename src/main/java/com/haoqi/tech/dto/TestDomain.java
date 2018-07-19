package com.haoqi.tech.dto;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Created by suzhengxiao on 2018/6/12.
 */
@Component
@Scope(value="prototype") //创建多实例prototype
public class TestDomain {
}
