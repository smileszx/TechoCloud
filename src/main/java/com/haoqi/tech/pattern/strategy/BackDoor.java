package com.haoqi.tech.pattern.strategy;

/**
 * Created by suzhengxiao on 2018/7/30.
 */
public class BackDoor implements IStrategy {
    @Override
    public void operate() {
        System.out.println("找乔国老帮忙，让吴国太给孙权施加压力");
    }
}
