package com.example.javase.controller;

import com.example.javase.designpattern.single.Single1;
import com.example.javase.designpattern.single.Single2;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/*
作者：蔡伟
时间：2019/8/6
描述：
*/
@Controller
public class SingleController {
private final static Logger logger = LoggerFactory.getLogger(SingleController.class);

    @RequestMapping(value = "single")
    public void testSingle(){
        Single1 single1 = Single1.doit();
        single1.setB(12);
        logger.info(Single1.a);

        Single2 single2 = Single2.getInstance();
        logger.info(Single2.a);
    }

}
