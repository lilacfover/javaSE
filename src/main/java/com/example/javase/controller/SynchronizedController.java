package com.example.javase.controller;

import com.example.javase.synchronizedstudy.SynchronizedObj;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("synchronized")
public class SynchronizedController {

    private static final Logger logger = LoggerFactory.getLogger(SynchronizedController.class);

//    private Synchronized1 synchronized1;
//    @Autowired
//    public void setSynchronized1(Synchronized1 synchronized1){
//        this.synchronized1 = synchronized1;
//    }
//
//
//    @Autowired
//    private Synchronized2 synchronized2;

//    @Autowired
//    private SynchronizedObj synchronizedObj;

    @RequestMapping("test1")
    public void testSynchronized1() throws InterruptedException {
//        Thread thread1 = new Thread(synchronized1,"线程1");
//        Thread thread2 = new Thread(synchronized2,"线程2");
//        thread1.start();
//        thread2.start();
//        thread1.join();
//        thread2.join();
////        logger.info("结果："+synchronizedObj.getNum()+"");
    }
    @RequestMapping("test2")
    public void testSynchronized2() throws InterruptedException {
        SynchronizedObj synchronizedObj1 = new SynchronizedObj();
        SynchronizedObj synchronizedObj2 = new SynchronizedObj();
        //1、同一个对象的两个线程访问同一个同步方法
//        logger.info("同一个对象的两个线程访问同一个同步方法\n");
//        new Thread(synchronizedObj1,"xaincheng 1").start();
//        new Thread(synchronizedObj1,"xaincheng 2").start();
        //2、两个对象访问同一个同步方法
//        logger.info("两个对象访问同一个同步方法\n");
//        new Thread(synchronizedObj1,"xaincheng 1").start();
//        new Thread(synchronizedObj2,"xaincheng 2").start();

//        logger.info("两个对象访问同一个静态同步方法");
//        new Thread(synchronizedObj1,"xaincheng 1").start();
//        new Thread(synchronizedObj2,"xaincheng 2").start();
//

//        logger.info("同一个对象访问同一个静态同步方法");
//        new Thread(synchronizedObj1,"xaincheng 1").start();
//        new Thread(synchronizedObj1,"xaincheng 2").start();

        logger.info("同一个对象两个线程同时访问一个静态同步方法和非静态同步方法");
        new Thread(synchronizedObj1,"xaincheng 1").start();
        new Thread(synchronizedObj1,"xaincheng 2").start();

    }
}
