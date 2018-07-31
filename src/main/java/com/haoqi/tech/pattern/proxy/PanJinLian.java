package com.haoqi.tech.pattern.proxy;

/**
 * Created by suzhengxiao on 2018/7/30.
 */
public class PanJinLian implements KindWomen{
    @Override
    public void makeEyesWithMan() {
        System.out.println("潘金莲嘿嘿嘿");
    }

    @Override
    public void happyWithMan() {
        System.out.println("潘金莲抛媚眼");
    }
}
