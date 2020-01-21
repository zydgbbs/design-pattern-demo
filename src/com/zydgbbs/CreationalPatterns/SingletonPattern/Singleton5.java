package com.zydgbbs.CreationalPatterns.SingletonPattern;

/**
 * 5、登记式/静态内部类
 * 是否 Lazy 初始化：是
 * 是否多线程安全：是
 * 实现难度：一般
 */
public class Singleton5 {
    private Singleton5(){}
    private static class SingletonHolder{
        private static final Singleton5 instance = new Singleton5();
    }
    public static Singleton5 getInstance(){
        return SingletonHolder.instance;
    }
}
