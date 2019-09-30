package com.example.javase.mythread;

public class TestThread extends Thread{
    public static Integer num = 12;
    private static Object object = new Object();
    public void run(){

        while (true){
            try {
                Thread.sleep(1000);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (object){
                --num;
                if(num.equals(0)){
                    System.out.println(Thread.currentThread().getName()+"退出......");
                    break;
                }
                System.out.println(Thread.currentThread()+" "+num);
            }

        }

    }
}
