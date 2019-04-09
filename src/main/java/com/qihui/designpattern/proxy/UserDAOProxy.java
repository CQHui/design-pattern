package com.qihui.designpattern.proxy;

/**
 * @author chenqihui
 * @date 2019/4/9
 */
public class UserDAOProxy implements UserDAO {
    private UserDAO userDAO;

    public UserDAOProxy(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Override
    public void findUser() {
        System.out.println("开启事物");
        userDAO.findUser();
        System.out.println("提交事务");
    }
}
