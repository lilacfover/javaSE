package com.example.javase.javabase;

/*
作者：蔡伟
时间：2019/8/20
描述：
*/public class Gess {

    public static void main(String[] args) {
        char word = 'd';
        char word2 = '@';
        int p = 123;
        int p2 = 2000;
        System.out.println("d 在unicode 的顺序位置是：" + (int)word);
        System.out.println("@ 在unicode 的顺序位置是：" + (int)word2);
        System.out.println("p 在Unicode的第123位是：" + (char)p);
        System.out.println("p2 在Unicode的第2000位是：" + (char)p2);
    }
}
