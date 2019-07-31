package com.example.javase.synchronizedstudy;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class SynchronizedObj {
    private static final Logger logger = LoggerFactory.getLogger(SynchronizedObj.class);
    private int num=1000000;

    public void addNum(){
        logger.info(Thread.currentThread().getName()+"addNum.....");
       num ++;
    }

    synchronized public void reduceNum(){
        logger.info(Thread.currentThread().getName()+"reduceNum.....");
        num = num - 1;
    }
    public int getNum() {
        logger.info(Thread.currentThread().getName()+".....");
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
