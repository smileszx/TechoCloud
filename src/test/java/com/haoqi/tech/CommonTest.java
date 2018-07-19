package com.haoqi.tech;

import java.util.Arrays;
import java.util.List;

import java.util.function.Predicate;

/**
 * Created by suzhengxiao on 2018/6/26.
 */
public class CommonTest {

    public static void main (String [] args) {
        //匿名类示例
        //(params) -> expression
        //(params) -> statement
        //(params) -> {statements}
//        new Thread (() -> System.out.println("In Java8, Lambda expression rocks !!")).start();
        List features = Arrays.asList("Lambdas", "Default Method", "Stream API", "Date and Time");
//        features.forEach(s -> System.out.println(s));
//        features.forEach(System.out :: println);

    }

}
