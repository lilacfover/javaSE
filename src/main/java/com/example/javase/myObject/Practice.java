package com.example.javase.myObject;

/*
作者：蔡伟
时间：2019/8/27
描述：Java子类继承了父类的所有属性，而private只是访问控制符，控制的何处能够访问到属性
*/public class Practice {

    public static void main(String[] args) {
        ObjectStudy2 objectStudy2 = new ObjectStudy2();
        System.out.println(objectStudy2.getName());

        ObjectStudy2 objectStudy3 = new ObjectStudy2();
        System.out.println(objectStudy3.getName());
    }
}
