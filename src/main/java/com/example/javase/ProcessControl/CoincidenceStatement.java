package com.example.javase.ProcessControl;

/*
作者：蔡伟
时间：2019/8/21
描述： 符合语句限制了局部变量的范围，x 在整个方法中有效，b，z，y在符合语句中有效
*/
public class CoincidenceStatement {
    public static void main(String[] args) {
        int x = 20;
        {
            int y = 40;
            System.out.println(y);
            int z = 245;
            boolean b;
            {
                b = y > z;
                System.out.println(b);
            }
            String word = "hello  ~";
            System.out.println(word);
            System.out.println(b);
        }
        System.out.println(x);

    }
}
