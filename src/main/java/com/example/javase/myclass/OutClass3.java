package com.example.javase.myclass;

interface OutInterface3{
    int getValue();
}
public class OutClass3 {
    public OutInterface3 doit(){

        return new OutInterface3(){
            int x = 10;

            public int getValue(){
               return x;
            }
        };
    }
}
