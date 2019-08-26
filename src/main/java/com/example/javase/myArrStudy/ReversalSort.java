package com.example.javase.myArrStudy;

/*
作者：蔡伟
时间：2019/8/26
描述：
*/public class ReversalSort {
    public static void main(String[] args) {
        int[] arr3 = new int[]{1,2,3,4,5};
        for(int i = 0 ; i<arr3.length/2;i++){
            int temp = arr3[i];
            arr3[i] = arr3[arr3.length-i-1];
            arr3[arr3.length-i-1] = temp;
        }

        for(int i = 0;i<arr3.length;i++){
            System.out.print(arr3[i]+" ");
        }
        System.out.println("");
    }
}
