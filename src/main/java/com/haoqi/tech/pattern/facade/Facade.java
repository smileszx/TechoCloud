package com.haoqi.tech.pattern.facade;

/**
 * Created by suzhengxiao on 2018/7/31.
 */
public class Facade {

    SubA subA = new SubA();
    SubB subB = new SubB();

    public void commonA () {
        subA.doA();
    }

    public void commonB () {
        subB.doB();
    }
    public static void main(String[] args) {
        System.out.println("new feature");
    }
}
