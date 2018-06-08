package com.haoqi.tech.dubbo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Consumer {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[]{"resources/spring/dubbo-consumer.xml"});
        context.start();
        // obtain proxy object for remote invocation
        DubboService dubboService = (DubboService) context.getBean("dubboService");
        // execute remote invocation
        String hello = dubboService.sayHello("world");
        // show the result
        System.out.println(hello);
    }
}