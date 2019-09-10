package com.example.javase.modifier;

public class Practice {
    public static void main(String[] args) {
        Sub s = new Sub();
        s.doit2();

        Pratens p = s;
        p.doit2();
        p.doit3();
    }
}
