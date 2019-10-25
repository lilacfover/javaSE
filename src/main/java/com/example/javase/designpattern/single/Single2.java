package com.example.javase.designpattern.single;

/*
作者：蔡伟
时间：2019/8/6
描述：懒汉式:延迟加载方式。
*/public class Single2 {
    public final static String a = "hello Single2";
    private Single2(){}
    private static volatile Single2 s = null;//保证线程安全
    public static synchronized Single2 getInstance(){
        if(s == null){
            s = new Single2();
        }
        return s;
    }
}
