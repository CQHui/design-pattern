package com.qihui.designpattern.singleton;

/**
 * @author chenqihui
 * @date 2019/4/8
 */
public class User03 {

    private User03() {}

    //枚举单例
    public static User03 getInstance() {
        return singletonUserEnum.INSTANCE.getInstance();
    }

    enum singletonUserEnum {
        INSTANCE;
        private User03 user03;

        singletonUserEnum() {
            user03 = new User03();
        }

        public User03 getInstance() {
            return this.user03;
        }
    }
}