package com.example.javase.myArrStudy;

/*
作者：蔡伟
时间：2019/8/26
描述：
*/public class DirectSorting {
    public static void main(String[] args) {
        int[] arr2 = new int[]{5,4,7,6,2};
        for(int i = 1;i<arr2.length;i++){
            int index = 0;
            for(int j = 1;j<=arr2.length-i;j++){
                if(arr2[j] > arr2[index]){
                    index = j;
                }
                int temp =  arr2[arr2.length-i];
                arr2[arr2.length-i] = arr2[index];
                arr2[index] = temp;
            }

        }
        for(int i = 0;i<arr2.length;i++){
            System.out.print(arr2[i]+" ");
        }
        System.out.println("");
    }
}
