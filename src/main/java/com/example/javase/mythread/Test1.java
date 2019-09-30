package com.example.javase.mythread;

import org.springframework.stereotype.Component;

@Component
public class Test1 {
    public Test1() {
        TestThread testThread = new TestThread();
        Thread threadA = new Thread(testThread,"threadA");
        threadA.start();
//        try {
//            threadA.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
    }
}
