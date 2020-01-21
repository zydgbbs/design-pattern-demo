package com.zydgbbs.CreationalPatterns.SingletonPattern;

/**
 * 6、枚举
 * JDK 版本：JDK1.5 起
 * 是否 Lazy 初始化：否
 * 是否多线程安全：是
 * 实现难度：易
 */
public enum Singleton6 {
    instance;
    public void whateverMethod() {
        System.out.println(Thread.currentThread().getName()+":"+this);
        //System.out.println("test");
    }
}
