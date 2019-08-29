package com.example.javase.myInterace;

/*
作者：蔡伟
时间：2019/8/29
描述：
*/public class Practice {

    public void test(Animal animal) {
        animal.eat();
    }
    public static void main(String[] args) {
        Animal animal = new Animal() {
            @Override
            public void eat() {
                System.out.println("我会吃东西");
            }
        };

        animal.eat();

        Dog dog = new Dog();
        Bird bird = new Bird();
        dog.setMouth("嘴巴");
        bird.setMouth("嘴巴");
        Practice practice = new Practice();
        practice.test(dog);
        practice.test(bird);

    }
}
