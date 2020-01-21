package com.zydgbbs.CreationalPatterns.SingletonPattern;

public class SingletonTest {
    public static void main(String[] args) {
        for (int i=0;i<1000;i++){
            new Thread(new Runnable() {
                @Override
                public void run() {
                    Singleton1 singleton1 = Singleton1.getInstance();
                    System.out.println(Thread.currentThread().getName()+":"+singleton1);
                }
            }).start();
        }
    }
}
