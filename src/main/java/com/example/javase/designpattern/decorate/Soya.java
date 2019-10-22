package com.example.javase.designpattern.decorate;

/*
作者：蔡伟
时间：2019/10/20
描述：
*/public class Soya implements Drink {
    @Override
    public String getDesc() {
        return "豆浆";
    }

    @Override
    public Double getMoney() {
        return 5.0;
    }
}
