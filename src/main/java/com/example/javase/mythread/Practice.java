package com.example.javase.mythread;

public class Practice {
    public static void main(String[] args) {
        TestThread testThread = new TestThread();

        Thread threadA = new Thread(testThread,"threadA");
        Thread threadB = new Thread(testThread,"threadB");
        Thread threadC = new Thread(testThread,"threadC");
        Thread threadD = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true){
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                        break;
                    }
                    System.out.println(Thread.currentThread().getName()+"......");
                }

            }
        },"threadD");
        threadB.start();
//        try {
//            threadB.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        threadA.start();
//        threadD.interrupt(); 捕捉到终端后必须手动去关闭线程
        System.out.println("start。。");
        while (true){
            System.out.println(TestThread.num);
            if(TestThread.num.equals(5)){
                try {
                    System.out.println("threadA wait。。。。。。");
                    threadA.wait(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            if(TestThread.num.equals(2)){
                threadA.notify();
                System.out.println("threadA.notify(。。。。。。");
            }
        }

    }
}
