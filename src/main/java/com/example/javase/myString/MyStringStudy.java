package com.example.javase.myString;

/*
作者：蔡伟
时间：2019/8/21
描述：
*/public class MyStringStudy {
    private void strToUpper(String s){
        System.out.println(s.toUpperCase());
    }

    private void strToower(String s){
        System.out.println(s.toLowerCase());
    }

    private boolean compareStr1AndStr2(String s1,String s2){
        if(s1.substring(1,3).equals(s2.substring(1,3))){
            return true;
        }else {
            return false;
        }

    }
    public static void main(String[] args) {
        String str1,str2;
        str1 = "hello java";
        str2 = str1;
        System.out.println(str1.indexOf('a'));
        System.out.println(str1.lastIndexOf('a'));
        System.out.println(str1.charAt(2));
        str1 = "hello";
        System.out.println(str2.length());
        System.out.println(str2.trim().length());
        str1.startsWith("hell");

        MyStringStudy myStringStudy = new MyStringStudy();
        myStringStudy.strToUpper("abcd");
        myStringStudy.strToower("ABCD");
        System.out.println(myStringStudy.compareStr1AndStr2("abcd","abcc"));
        StringBuilder stringBuilder = new StringBuilder();
        for(int i=1;i<=10;i++){
            stringBuilder.append(i);
        }
        System.out.println(stringBuilder);

        String num = "13693410096";
        String reg = "^(13[0-9]|14[0-9]|15[0-9]|166|17[0-9]|18[0-9]|19[8|9])\\d{8}$";
        System.out.println(num.matches(reg));

    }
}
