package com.haoqi.tech.dubbo;

public class Provider {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[] {"META-INF/spring/dubbo-demo-provider.xml"});
        context.start();
        // press any key to exit
        System.in.read();
    }
}