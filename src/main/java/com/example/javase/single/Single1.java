package com.example.javase.single;

/*
作者：蔡伟
时间：2019/8/6
描述：饿汉式
1，私有化构造函数；
2，创建私有并静态的本类对象；
3，定义公有并静态的方法，返回该对象。

*/public class Single1 {
    public final static String a = "helle Single1";
    private Integer b = 0;
    private Single1(){}
    private static Single1 s = new Single1();
//    private static Single1 s2 = new Single1();
    public static Single1 doit(){

        return s;
    }
//    public static Single1 doit2(){
//
//        return s2;
//    }

    public Integer getB() {
        return b;
    }

    public void setB(Integer b) {
        this.b = b;
    }
}
