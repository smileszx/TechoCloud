package com.haoqi.tech.pattern.facade;

/**
 * Created by suzhengxiao on 2018/7/31.
 */
public class Client {

    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.commonA();
        facade.commonB();
    }
}
