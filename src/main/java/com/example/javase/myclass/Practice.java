package com.example.javase.myclass;

public class Practice {
    public static void main(String[] args) {
        OutClass outClass = new OutClass();
        OutInterface outInterface =outClass.doitInterClass();
        OutInterface outInterface2 =outClass.doitInterClass2();
        outInterface.drow();
        outInterface2.drow();

        OutClass2 outClass2 = new OutClass2();
        outClass2.doit("hello java");

        OutClass3 outClass3 = new OutClass3();
        OutInterface3 outInterface3 =outClass3.doit();
        System.out.println(outInterface3.getValue());
    }
}
