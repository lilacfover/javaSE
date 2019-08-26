package com.example.javase.myArrStudy;

/*
作者：蔡伟
时间：2019/8/26
描述：
*/public class BubSort {
    public static void main(String[] args) {
        int[] arr1 = new int[]{5,4,7,6,2};
        for(int i = 1;i<arr1.length;i++){
            for(int j = 0;j<arr1.length - i;j++){
                if(arr1[j] > arr1[j+1]){
                    int temp = arr1[j];
                    arr1[j] = arr1[j+1];
                    arr1[j+1] = temp;
                }
            }
        }

        for(int i = 0;i<arr1.length;i++){
            System.out.print(arr1[i]+" ");
        }
        System.out.println("");
    }
}
