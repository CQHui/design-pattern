package com.qihui.designpattern.singleton;

import javax.annotation.concurrent.ThreadSafe;

/**
 * @author chenqihui
 * @date 2019/4/8
 */
@ThreadSafe
public class User01 {

    private static final User01 user01 = new User01();

    private User01() {}

    //饿汉式
    public static User01 getInstance() {
        return user01;
    }

}
