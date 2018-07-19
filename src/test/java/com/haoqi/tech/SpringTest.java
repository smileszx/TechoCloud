package com.haoqi.tech;

import com.haoqi.tech.config.ComponentConfig;
import com.haoqi.tech.dto.TestDomain;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertNotNull;

/**
 * Created by suzhengxiao on 2018/6/12.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ComponentConfig.class)
public class SpringTest {
    @Autowired
    private TestDomain testDomain;


    @Test
    public void test(){
        assertNotNull(testDomain);
        System.err.println(testDomain);
    }

    @Test
    public void getObject () {
        System.err.println(testDomain);
    }

}
