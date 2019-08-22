package com.example.javase.myArrStudy;

/*
作者：蔡伟
时间：2019/8/22
描述：
*/public class OneArr {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1,2,3};
        int[] arr2 = {4,5,6};

        int[] arr3;
        arr3 = new int[]{1,2,3};
        for(int i=0;i<3;i++){
            System.out.println(arr3[i]);
        }
    }
}
