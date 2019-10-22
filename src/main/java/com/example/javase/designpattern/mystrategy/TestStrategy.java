package com.example.javase.designpattern.mystrategy;

public class TestStrategy {
    public static void main(String[] args) {
        Man man = null;
        man = new Caiwei("蔡伟");
        man.setReduceweightStrategy(new IndoorRun());
        System.out.println(man.getName());
        man.SelectReduceweightMethod();
    }
}
