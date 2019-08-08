package com.example.javase.studyenum;

/*
作者：蔡伟
时间：2019/8/8
描述：
*/
public enum EnumTest2 {
    MON(1), TUE(2), WED(3), THU(4), FRI(5), SAT(6) {
//        @Override
        public boolean isRest() {
            return true;
        }
    },
    SUN(0) {
//        @Override
        public boolean isRest() {
            return true;
        }
    };

    private int value;

    EnumTest2(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public boolean isRest() {
        return false;
    }
}
