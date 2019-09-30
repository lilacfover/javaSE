package com.example.javase.mythread;


import org.springframework.stereotype.Component;

@Component
public class Test2 {
    public Test2() {
        System.out.println("threadB");
        TestThread testThread = new TestThread();
        Thread threadB = new Thread(testThread,"threadB");
        threadB.start();
        System.out.println("start");
//        try {
//            threadB.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
    }
}
