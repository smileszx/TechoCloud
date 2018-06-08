package com.haoqi.tech.dubbo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Provider {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[] {"resources/spring/dubbo-provider.xml"});
        context.start();
        // press any key to exit
        System.in.read();
    }
}