package com.example.javase.studyenum;

/*
作者：蔡伟
时间：2019/8/8
描述：
*/public enum EnumTest {
    MON, TUE, WED, THU, FRI, SAT, SUN(){
        @Override
        public void test(){
            System.out.println("test Enum");
        }
    };

    Integer value;

//    EnumTest(Integer value) {
//        this.value = value;
//    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public void test(){
        System.out.println("test Enum");
    }
}
