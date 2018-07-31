package com.haoqi.tech.pattern.strategy;

import com.haoqi.tech.pattern.strategy.BackDoor;
import com.haoqi.tech.pattern.strategy.BlockEnemy;
import com.haoqi.tech.pattern.strategy.Context;
import com.haoqi.tech.pattern.strategy.GivenGreenLight;

/**
 * Created by suzhengxiao on 2018/7/30.
 */
public class ZhaoYun {

    public static void main(String[] args) {
        Context context;

        //刚到吴国拆第一个锦囊
        System.out.println("------刚到吴国拆第一个-------");
        context = new Context(new BackDoor());

        context.operate(); //执行

        System.out.println("\n\n\n");

        //刘备乐不思蜀，拆第二个
        System.out.println("---------刘备乐不思蜀，拆第二个");
        context = new Context(new GivenGreenLight());
        context.operate();
        System.out.println("\n\n\n");

        System.out.println("----------孙权追兵，如何破？ 拆第三个------");
        context = new Context(new BlockEnemy());
        context.operate();
        System.out.println("\n\n\n");
    }
}
