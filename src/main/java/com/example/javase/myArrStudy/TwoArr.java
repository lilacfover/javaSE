package com.example.javase.myArrStudy;

/*
作者：蔡伟
时间：2019/8/22
描述：
*/public class TwoArr {
    public static void main(String[] args) {
        int[][] a = new int[][]{{1,2,3},{4,5,6}};
        int[][] b;
        b = new int[2][4];
        b[0][0] = 1;
        b[0][1] = 1;
        b[0][2] = 1;
        b[0][3] = 1;

        b[1][0] = 2;
        b[1][1] = 2;
        b[1][2] = 2;
        b[1][3] = 2;

        int[][] c = new int[3][];
        c[0] = new int[3];
        c[1] = new int[2];
        c[2] = new int[3];
//        for(int i = 0;i<a.length;i++){
//            for(int j = 0;j<a[i].length;j++){
//                System.out.print(a[i][j]);
//            }
//            System.out.println("");
//        }
//
//        for(int i = 0;i<b.length;i++) {
//            for (int j = 0; j < b[i].length; j++) {
//                System.out.print(b[i][j]);
//            }
//        }
        for(int[] temp:c){
            for(int j:temp){
                System.out.print(j);
            }
        }
//        for(int i = 0;i<c.length;i++){
//            for(int j = 0;j<c[i].length;j++){
//                System.out.print(c[i][j]);
//            }
//            System.out.println("");
//        }

    }
}
