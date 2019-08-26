package com.example.javase.myArrStudy;

/*
作者：蔡伟
时间：2019/8/26
描述：
*/public class Practice {
    public static void main(String[] args) {
        int[][] arr = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        for(int i = 0;i<arr.length;i++){
            for(int j =0 ;j<arr.length;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println(" ");
        }


        for(int i = 0;i<arr.length;i++){
            for(int j = 0;j < arr.length-i;j++){
                int temp = arr[i][j+i];
                arr[i][j+i] = arr[j+i][i];
                arr[j+i][i] = temp;
            }
        }

        for(int i = 0;i<arr.length;i++){
            for(int j =0 ;j<arr.length;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println("");
        }
    }


}
