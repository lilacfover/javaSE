package com.example.javase.javabase;

/*
作者：蔡伟
时间：2019/8/20
描述：正数8的二进制表示如下：00000000 00000000 00000000 00001000  
（正数8的原码，补码，反码都是这串二进制数）
对正数8进行取反得：11111111 11111111 11111111 11110111（*）
可以发现对正数8进行取反后由于符号位变成了1
故得到了一个负数然而java存储负数时是用其补码来进行存储的即问题转化为
求由于对正数8取反所得的负数存储问题！按照负数原码和补码转化规则：1.（*）的符号位1不变，
其它位取反得到反码：     
10000000 00000000 00000000 000010002.反码的符号位不变，反码的数值位最低位加1，
得到补码：     10000000 00000000 00000000 00001001（该串二进制数即为输出的-9）
以上就是为什么对正数8取反操作后输出的值为-9的原因。

作者：LiChangBao
链接：https://www.jianshu.com/p/966bf84a2bfe
来源：简书
简书著作权归作者所有，任何形式的转载都请联系作者获得授权并注明出处。
*/public class Operator {

    public static void main(String[] args) {
        byte a = 4; // 0000 0001
        byte b = 2; // 0000 0010
        byte d = 3;
        byte e = 4;
        System.out.println(~a);//取反 1111 1110  反码 1000 0001 加一 1000 0010 得到-2
        System.out.println(a^b); //3
        System.out.println(a>>1); // 0
        System.out.println(a<<1); // 2
        System.out.println(a >>>3 );//0


        byte c = b>a?d:e;
        System.out.println(c);
    }
}
