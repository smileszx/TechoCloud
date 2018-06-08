package com.haoqi.tech.dubbo.provider;

import com.haoqi.tech.dubbo.DubboService;

/**
 * Created by suzhengxiao on 2018/6/8.
 */
public class DubboServiceImpl implements DubboService{

    @Override
    public String sayHello(String name) {
        return "Hello " + name;
    }
}
