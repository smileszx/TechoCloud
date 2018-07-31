package com.haoqi.tech.pattern.strategy;

/**
 * Created by suzhengxiao on 2018/7/30.
 */
public class Context {

    private IStrategy strategy;

    public Context(IStrategy strategy) {
        this.strategy = strategy;
    }

    public void operate() {
        this.strategy.operate();
    }
}
