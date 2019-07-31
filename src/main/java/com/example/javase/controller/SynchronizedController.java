package com.example.javase.controller;

import com.example.javase.synchronizedstudy.Synchronized1;
import com.example.javase.synchronizedstudy.Synchronized2;
import com.example.javase.synchronizedstudy.SynchronizedObj;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("synchronized")
public class SynchronizedController {

    private static final Logger logger = LoggerFactory.getLogger(SynchronizedController.class);

    private Synchronized1 synchronized1;
    @Autowired
    public void setSynchronized1(Synchronized1 synchronized1){
        this.synchronized1 = synchronized1;
    }


    @Autowired
    private Synchronized2 synchronized2;

    @Autowired
    private SynchronizedObj synchronizedObj;

    @RequestMapping("test1")
    public void testSynchronized1() throws InterruptedException {
        Thread thread1 = new Thread(synchronized1,"线程1");
        Thread thread2 = new Thread(synchronized2,"线程2");
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        logger.info("结果："+synchronizedObj.getNum()+"");
    }

}
