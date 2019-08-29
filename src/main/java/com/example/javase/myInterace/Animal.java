package com.example.javase.myInterace;

/*
作者：蔡伟
时间：2019/8/29
描述：
*/public abstract class Animal {
    private String mouth;
    public abstract void eat();

    public Animal() {
        System.out.println("我是动物类的构造方法");
    }

    public void call(){
        System.out.println("我是动物....");
    }

    public String getMouth() {
        return mouth;
    }

    public void setMouth(String mouth) {
        this.mouth = mouth;
    }
}
