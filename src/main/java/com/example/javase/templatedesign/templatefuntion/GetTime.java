package com.example.javase.templatedesign.templatefuntion;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
作者：蔡伟
时间：2019/8/7
描述：
*/
public abstract class GetTime {
    private  static final Logger logger = LoggerFactory.getLogger(GetTime.class);
    public final void getTime(){
        Long start  = System.currentTimeMillis();
        code();
        Long end = System.currentTimeMillis();
        System.out.println("time:"+(end-start));
    }
    public abstract void code();
}


