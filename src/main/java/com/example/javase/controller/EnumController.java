package com.example.javase.controller;

import com.example.javase.studyenum.EnumTest;
import com.example.javase.studyenum.EnumTest2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/*
作者：蔡伟
时间：2019/8/8
描述：
*/
@Controller
public class EnumController {

    @RequestMapping(value = "enumTest")
    @ResponseBody
    public void enumTest(){

        EnumTest temp = EnumTest.MON;
        switch (temp){
            case MON:
                System.out.println("今天是星期一");
                break;
            case TUE:
                System.out.println("今天是星期二");
                break;
            default:
                System.out.println("今天有点晕...");
        }

        System.out.println(temp.compareTo(EnumTest.SUN));
        switch (temp.compareTo(EnumTest.SUN)){
            case -1:
                System.out.println("在星期6前面");
                break;
            case 1:
                System.out.println("在星期6后面");
                break;
            default:
                System.out.println("相等");
        }
        System.out.println(temp.name());
        System.out.println(temp.getDeclaringClass());
        System.out.println(temp.ordinal());
        EnumTest.SUN.test();

        EnumTest2 enumTest2 = EnumTest2.MON;
        System.out.println(enumTest2);
        System.out.println(EnumTest2.SUN.isRest());
        System.out.println("EnumTest2.values()"+EnumTest2.values().toString());
        System.out.println(EnumTest2.valueOf("SUN"));
    }





}
