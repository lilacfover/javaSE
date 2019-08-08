package com.example.javase.templatedesign.templatefuntion;

/*
作者：蔡伟
时间：2019/8/7
描述：
*/public class SubDemo extends GetTime {
        @Override
        public void code() {
            StringBuffer stringBuffer = new StringBuffer();

            for(int y=0; y<10000; y++){
                stringBuffer.append(y);
            }
        }

}
