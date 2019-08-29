package com.example.javase.myInterace;

/*
作者：蔡伟
时间：2019/8/29
描述：
*/public class Dog  extends Animal implements IActionRun {
    @Override
    public void eat() {
        System.out.println("我是小狗  我会吃东西"+"因为我有"+super.getMouth());

    }

    @Override
    public void run() {
        System.out.println("我是小狗  我会跑");
    }

}
