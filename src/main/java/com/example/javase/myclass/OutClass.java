package com.example.javase.myclass;
interface OutInterface{
    public void drow();
}
public class OutClass {
    private class interClass implements OutInterface{
        @Override
        public void drow() {
            System.out.println("我是interClass实现drow ");
        }
    }

    private class interClass2 implements OutInterface{
        @Override
        public void drow() {
            System.out.println("我是interClass2实现drow ");
        }
    }

    public OutInterface doitInterClass(){
        return new interClass();
    }

    public OutInterface doitInterClass2(){
        return new interClass2();
    }
}
