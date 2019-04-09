package com.qihui.designpattern.proxy;

/**
 * @author chenqihui
 * @date 2019/4/9
 */
public class UserDAOImpl implements UserDAO {
    @Override
    public void findUser() {
        System.out.println("finging user...");
    }
}
