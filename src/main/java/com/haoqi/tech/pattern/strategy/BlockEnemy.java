package com.haoqi.tech.pattern.strategy;

/**
 * Created by suzhengxiao on 2018/7/30.
 */
public class BlockEnemy implements IStrategy {
    @Override
    public void operate() {
        System.out.println("孙夫人断后，挡住追兵");
    }
}
