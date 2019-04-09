package com.qihui.designpattern.singleton;

import javax.annotation.concurrent.ThreadSafe;

/**
 * @author chenqihui
 * @date 2019/4/8
 */
@ThreadSafe
public class User02 {
    private static volatile User02 user02;

    private User02() {}

    //懒汉式，效率低
    public synchronized static User02 getInstance() {
        if (user02 == null) {
            user02 = new User02();
        }
        return user02;
    }

    /**
     *  双重检测锁,线程安全，提高效率
     *  据说有重排序问题（解决办法 user02加volatile）
     */
    public static User02 getInstanceQuick() {
        if (user02 == null) {
            synchronized (User02.class) {
                if (user02 == null) {
                    user02 = new User02();
                }
            }
        }
        return user02;
    }
}
