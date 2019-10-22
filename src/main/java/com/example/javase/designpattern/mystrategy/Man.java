package com.example.javase.designpattern.mystrategy;

public abstract class Man {

    private String name;

    private ReduceweightStrategy reduceweightStrategy;

    public Man(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setReduceweightStrategy(ReduceweightStrategy reduceweightStrategy) {
        this.reduceweightStrategy = reduceweightStrategy;
    }

    public void SelectReduceweightMethod(){
        reduceweightStrategy.ReduceweightMethod();
    }
}
