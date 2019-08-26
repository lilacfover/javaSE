package com.example.javase.myArrStudy;

import java.lang.reflect.Array;
import java.util.Arrays;

/*
作者：蔡伟
时间：2019/8/26
描述：
*/public class ArrOperation {
    public static void main(String[] args) {
        int[] a = new int[]{1,2,3,4,5,6};
        Arrays.fill(a,8);
        for(int i = 0; i < 6; i++){
            System.out.println(a[i]);
        }

        int[] b = new int[]{1,2,3,4,5,6};
        Arrays.fill(b,1,2,9);
        for(int i = 0; i < 6; i++){
            System.out.println(b[i]);
        }
        Arrays.sort(b);
        for(int i = 0; i < 6; i++){
            System.out.println(b[i]);
        }

        int[] temp = new int[]{1,2,3,4};
        int[] temp2 = Arrays.copyOf(temp,5);
        for(int i = 0; i < 5; i++){
            System.out.println(temp2[i]);
        }
        int[] temp3 = Arrays.copyOfRange(temp,1,3);
        for(int i = 0; i < 2; i++){
            System.out.println(temp3[i]);
        }

        System.out.println(Arrays.binarySearch(temp3,2));
    }
}
