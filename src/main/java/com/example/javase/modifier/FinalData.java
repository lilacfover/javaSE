package com.example.javase.modifier;

public class FinalData {
    private final int VALUE_1 = 1;
    private final static int VALUE_2 = 1;
    private final Test test = new Test();
    private final static Test test3 = new Test();
    private Test test2 = new Test();

    private final int[] a = {1,2,3};
    private final int b = 1;

    public void add(final int b){
        System.out.println(b+1);
    }
    public static void main(String[] args) {
        FinalData finalData = new FinalData();
        finalData.add(12);
        finalData.test.i = 18; //final 引用不能被修改（地址不能修改）但是对象的值可以被修改
//        finalData.test = new Test(); 不可以将制定为final的引用指向其他引用
//        FinalData.VALUE_2 ++; 不能改变定义为final 的常量
        finalData.test2 = new Test();
        System.out.println(finalData.a[1]);
        finalData.a[1] = 10; //这样可以看出来,final是限定arr这个变量,他指向(代表)的是哪一个对象
                             //他不能指向另一个对象,但是对象本身的修改不受限制.
                            //实际上,被final修饰的变量就不能叫"变量"了,因为它不能被重新赋值.仅此而已.
//        finalData.b = 18;
        System.out.println(finalData.a[1]);
    }
}
