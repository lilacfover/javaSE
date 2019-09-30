package com.example.javase.studyenum;

import java.util.List;

public class LimitClass<T> {
    private T tempA;

    public LimitClass(T tempA) {
        this.tempA = tempA;
    }

    public T getTempA() {
        return tempA;
    }

    public void setTempA(T tempA) {
        this.tempA = tempA;
    }
}
