package com.zydgbbs.CreationalPatterns.SingletonPattern;

/**
 * 1、懒汉式，线程不安全
 * 是否 Lazy 初始化：是
 * 是否多线程安全：否
 * 实现难度：易
 */
public class Singleton1 {
    private static Singleton1 instance;
    private Singleton1(){}
    public static Singleton1 getInstance(){
        if (instance==null){
            instance = new Singleton1();
        }
        return instance;
    }
}
