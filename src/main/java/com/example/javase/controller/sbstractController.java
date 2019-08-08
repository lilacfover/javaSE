package com.example.javase.controller;

import com.example.javase.templatedesign.templatefuntion.SubDemo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.javase.templatedesign.templatefuntion.*;
import org.springframework.web.bind.annotation.ResponseBody;

/*
作者：蔡伟
时间：2019/8/7
描述：
*/
@Controller
public class sbstractController {
    private  static final Logger logger = LoggerFactory.getLogger(sbstractController.class);

    @RequestMapping(value = "abstract")
    @ResponseBody
    public String  test() {
       SubDemo subDemo = new SubDemo();
       subDemo.getTime();
        TestGetTimeDemo testGetTimeDemo = new TestGetTimeDemo();
        testGetTimeDemo.getTime();

        return "success";
    }

}
