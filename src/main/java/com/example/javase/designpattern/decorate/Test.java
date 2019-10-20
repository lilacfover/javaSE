package com.example.javase.designpattern.decorate;

/*
作者：蔡伟
时间：2019/10/20
描述：
*/public class Test {
    public static void main(String[] args) {

        Drink drink = new Soya();

        Drink drinkm =  new Milk(drink);


        Drink drinks = new Sugar(drinkm);
        System.out.println(drinks.getDesc() + drinks.getMoney());


    }
}
