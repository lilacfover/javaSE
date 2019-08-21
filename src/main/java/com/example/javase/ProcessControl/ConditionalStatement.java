package com.example.javase.ProcessControl;

/*
作者：蔡伟
时间：2019/8/21
描述：
*/public class ConditionalStatement {
    private void switchTest(int temp){
        switch(temp){
            case 1:
                System.out.println(temp);
                break;
            case 2:
                System.out.println(temp);
                break;
            default:
                System.out.println("error");
        }
    }
    public static void main(String[] args) {
        int a = 7;
        //只会执行 a  > 5
        if( a > 5) {
            System.out.println("a>5");
        }else if(  a > 6){
            System.out.println("a>6");
        }else {
            System.out.println("error");
        }

        ConditionalStatement conditionalStatement = new ConditionalStatement();
        conditionalStatement.switchTest(a);
    }
}
