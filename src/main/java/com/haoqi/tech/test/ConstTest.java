package com.haoqi.tech.test;

public class ConstTest {

    public static void main(String[] args) {
        Long a = 100L;
        Long b = 100L;
        System.out.println(a==b);

        String s1 = "a";
        String s2 = "A";

        System.out.println(s1==s2);

        System.out.println(s1.equals(s2));

        System.out.println(s1.equalsIgnoreCase(s2));


    }
}
