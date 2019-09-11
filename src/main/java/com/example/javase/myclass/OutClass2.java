package com.example.javase.myclass;

interface OutInterface2{

}
public class OutClass2 {
    public OutInterface2 doit(final String x){

        String  a = "llllllllll";
        class  interClass2 implements OutInterface2{
            interClass2(String s) {
                s = a;
                System.out.println(s);
            }
        }
        return new interClass2("doit");
    }
}
