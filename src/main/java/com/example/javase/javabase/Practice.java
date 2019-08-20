package com.example.javase.javabase;

/*
作者：蔡伟
时间：2019/8/21
描述：
*/public class Practice{
    //全局变量作用于整个类
    public Integer age;
    private void add(int a,int b){
        System.out.println("a + b = "+(a+b));
    }

    //局部变量作用于当前代码块
    private void outName(String name){
        System.out.println("name is "+name);
    }

    private void cover(){
        float a = 1.2f;
        double b = 2.233;
        System.out.println((int)a);
        System.out.println((int)b);
    }

    public static void main(String[] args) {
        Practice practice = new Practice();
        practice.add(1,2);
        practice.outName("caiwei");
        practice.cover();
    }
}
