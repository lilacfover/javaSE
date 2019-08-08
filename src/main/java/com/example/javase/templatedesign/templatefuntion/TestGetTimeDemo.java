package com.example.javase.templatedesign.templatefuntion;

/*
作者：蔡伟
时间：2019/8/7
描述：
*/public class TestGetTimeDemo extends GetTime {
    @Override
    public void code() {
        StringBuilder stringBuilder =new StringBuilder();
        for(int i=0;i<10000;i++) {
            stringBuilder.append(i);
        }
    }
}
