package com.zydgbbs.CreationalPatterns.SingletonPattern;

/**
 * 4、双检锁/双重校验锁（DCL，即 double-checked locking）
 * JDK 版本：JDK1.5 起
 * 是否 Lazy 初始化：是
 * 是否多线程安全：是
 * 实现难度：较复杂
 */
public class Singleton4 {
    private volatile static Singleton4 instance;
    private Singleton4(){}
    public static Singleton4 getInstance(){
        if(instance==null){
            synchronized (Singleton4.class){
                if(instance==null){
                    instance = new Singleton4();
                }
            }
        }
        return instance;
    }
}
