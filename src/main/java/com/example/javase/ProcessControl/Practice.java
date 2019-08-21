package com.example.javase.ProcessControl;

/*
作者：蔡伟
时间：2019/8/21
描述：
*/public class Practice {
    private void determineNum(int temp){
        if((temp%2) > 0){
            System.out.println("该数据是奇数");
        }else {
            System.out.println("该数据是偶数");
        }
    }

    private void printDiamond(int num){
        for(int i = 1;i <=  num; i++){
            for(int j = num -i ; j > 0 ;j --){
                System.out.print(" ");
            }
            for(int k = 2*i - 1;k > 0 ;k--){
                System.out.print("*");
            }
            System.out.print("\n");
        }

        for(int i = 1;i<=num-1;i++){
            for(int j = i ; j > 0; j--){
                System.out.print(" ");
            }
            for(int k = (num*2 - (2*i +1));k > 0;k--){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

    private void factorial(int n){
        double sum = 0.0;
        while(n>0){
            Long temp = 1L;
            for (int i=1;i<=n;i++){
                temp = temp*i;
            }
            sum = sum + 1.0/temp;
            n--;
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {

        int a = 2;
        Practice practice = new Practice();
        practice.determineNum(a);
        practice.printDiamond(7);
        practice.factorial(20);
    }
}
