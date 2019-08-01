package com.example.javase.synchronizedstudy;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SynchronizedObj implements Runnable{
    private static final Logger logger = LoggerFactory.getLogger(SynchronizedObj.class);
    private int num=1000000;


    public synchronized void synchronizedObjMethod() {
        logger.info("我是 "+Thread.currentThread().getName()+"SynchronizedObj...");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    synchronized public  static void Method() {
        logger.info("我是 "+Thread.currentThread().getName()+"Method...");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    synchronized public void addNum(){
        logger.info(Thread.currentThread().getName()+"addNum.....");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        num ++;
    }

    synchronized public void reduceNum(){
        logger.info(Thread.currentThread().getName()+"reduceNum.....");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        num = num - 1;
    }
    public int getNum() {
        logger.info(Thread.currentThread().getName()+".....");
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public void run() {
        Method();
        synchronizedObjMethod();

//        addNum();
    }
}
