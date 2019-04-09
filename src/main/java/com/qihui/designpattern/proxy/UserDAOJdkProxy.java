package com.qihui.designpattern.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author chenqihui
 * @date 2019/4/9
 */
public class UserDAOJdkProxy implements InvocationHandler {


    private UserDAO userDAO;

    public UserDAOJdkProxy(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("动态代理开启事务");
        Object invoke = method.invoke(userDAO, args);
        System.out.println("动态代理提交事务");
        return invoke;
    }
}
