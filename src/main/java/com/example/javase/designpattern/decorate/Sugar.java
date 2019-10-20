package com.example.javase.designpattern.decorate;

/*
作者：蔡伟
时间：2019/10/20
描述：
*/public class Sugar extends SoyaDecorate {
    Sugar(Drink drink) {
        super(drink);
    }

    @Override
    public String getDesc() {
        return super.getDesc() + "+糖";
    }

    @Override
    public Double getMoney() {
        return super.getMoney() + 1.1;
    }
}
