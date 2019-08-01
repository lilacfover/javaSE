//package com.example.javase.synchronizedstudy;
//
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
//@Component
//public class Synchronized2 implements Runnable {
//    private static final Logger logger = LoggerFactory.getLogger(Synchronized2.class);
//    @Autowired
//    private SynchronizedObj synchronizedObj;
//    @Override
//    public void run() {
////        for(int i=0;i<100000;i++){
////            synchronizedObj.addNum();
////        }
//        for(int i=0;i<100;i++){
//            synchronizedObj.reduceNum();
//        }
//        logger.info(Thread.currentThread().getName()+":"+synchronizedObj.getNum()+"");
//    }
//}
