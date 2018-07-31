package com.haoqi.tech.pattern.strategy;

/**
 * Created by suzhengxiao on 2018/7/30.
 */
public class GivenGreenLight implements IStrategy {
    @Override
    public void operate() {
        System.out.println("求吴国太开个绿灯,放行！ ");
    }
}
