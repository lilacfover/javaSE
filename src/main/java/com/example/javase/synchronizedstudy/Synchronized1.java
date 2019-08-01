package com.example.javase.synchronizedstudy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Synchronized1 implements Runnable {
    private static final Logger logger = LoggerFactory.getLogger(Synchronized1.class);

    public synchronized void synchronized1Method(){
        logger.info("我是 Synchronized1...");

    }
    @Override
    public void run() {

    }
}
