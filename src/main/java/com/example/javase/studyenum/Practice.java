package com.example.javase.studyenum;

import java.util.ArrayList;
import java.util.List;

public class Practice {

    public void test(LimitClass<? extends List> limitClass){
        System.out.println(limitClass.getTempA().toString());
    }
    public static void main(String[] args) {
        Practice practice = new Practice();
        ArrayList a1 = new ArrayList();
        a1.add("123");
        LimitClass<ArrayList> listLimitClass = new LimitClass<ArrayList>(new ArrayList());
        listLimitClass.setTempA(a1);
        practice.test(listLimitClass);


        String a2 = new String("abc");
        LimitClass<String> listLimitClass1 = new LimitClass<String>(new String());
        listLimitClass1.setTempA(a2);
        System.out.println(listLimitClass1.getTempA());
//        practice.test(listLimitClass1); 只能接受参数为list的实例
//        如果将 LimitClass 中的 <T> 变为<T ？ entends List> 可以避免错误  因为实例化的
        //listLimitClass 都是list的子类

        LimitClass <? extends List> a= null;
        LimitClass limitClass3 =  new LimitClass<ArrayList>(a1);
        a = limitClass3;
        System.out.println(a.getTempA());
//        a.setTempA(a1); 被通配符初始化的不能被修改 只能获取和删除
//        limitClass3.setTempA(a1);
//        Number
//        n.add(1); 被通配符初始化的不能被修改 只能获取和删除
        List<String> list = new ArrayList<>();
        list.add("123");
        List<?> n = list;
        n.get(0);
    }
}
