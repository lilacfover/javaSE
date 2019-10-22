package com.example.javase.designpattern.decorate;

/*
作者：蔡伟
时间：2019/10/20
描述：
*/public abstract class SoyaDecorate implements Drink {

    private Drink drink;
    SoyaDecorate(Drink drink) {
        this.drink = drink;
    }

    @Override
    public String getDesc() {
        return drink.getDesc();
    }

    @Override
    public Double getMoney() {
        return drink.getMoney();
    }
}
