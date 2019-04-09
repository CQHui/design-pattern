package com.qihui.designpattern.proxy;

import java.lang.reflect.Proxy;

/**
 * @author chenqihui
 * @date 2019/4/9
 */
public class Main {
    public static void main(String[] args) {
        UserDAO userDAO = new UserDAOImpl();
        //静态代理  需要生成代理类
        UserDAOProxy userDAOProxy = new UserDAOProxy(userDAO);
        userDAOProxy.findUser();

        UserDAOJdkProxy userDAOJdkProxy = new UserDAOJdkProxy(userDAO);
        ClassLoader classLoader = userDAO.getClass().getClassLoader();
        Class<?>[] interfaces = userDAO.getClass().getInterfaces();
        // 主要装载器、一组接口及调用处理动态代理实例
        UserDAO proxyUserDAO = (UserDAO) Proxy.newProxyInstance(classLoader, interfaces, userDAOJdkProxy);
        proxyUserDAO.findUser();
    }
}
