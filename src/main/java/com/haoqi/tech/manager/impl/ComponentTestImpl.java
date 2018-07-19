package com.haoqi.tech.manager.impl;

import com.haoqi.tech.dto.TestDTO;
import com.haoqi.tech.manager.ComponentTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import static org.hibernate.validator.internal.util.Contracts.assertNotNull;

/**
 * Created by suzhengxiao on 2018/6/12.
 */
@Component
public class ComponentTestImpl implements ComponentTest {

    @Override
    public void test() {
        System.err.println("Spring自动扫描！！！");
    }
}
