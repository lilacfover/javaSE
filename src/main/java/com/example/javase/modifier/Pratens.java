package com.example.javase.modifier;

public class Pratens {

    private final void doit(){
        System.out.println("父类doit");
    }

     final void doit2(){
        System.out.println("父类doit2");
    }

    public  void doit3(){
        System.out.println("父类doit3");
    }
}
