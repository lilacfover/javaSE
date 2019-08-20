package com.example.javase.javabase;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
作者：蔡伟
时间：2019/8/20
描述：
*/public class Number {
    private  static final Logger logger = LoggerFactory.getLogger(Number.class);
    public static void main(String[] args) {
        byte a = 127;
        short b = 20000;
        int c = 600000;
        Long d = 10000000L;
        Long result = a + b + c + d;
        System.out.println(result);

    }
}
