package com.qihui.designpattern.proxy;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author chenqihui
 * @date 2019/4/9
 */
public class UserDAOCGlibProxy implements MethodInterceptor {

    // Object可以接受任意一种参数作为被代理类，实现了动态代理
    private Object targetObject;

    public Object getInstance(Object target) {
        // 设置需要创建子类的类
        this.targetObject = target;
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(target.getClass());
        enhancer.setCallback(this);
        return enhancer.create();
    }

    //cglib实现动态代理
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy proxy) throws Throwable {
        System.out.println("开启事物");
        Object result = proxy.invoke(targetObject, objects);
        System.out.println("关闭事物");
        return result;
    }

    public static void main(String[] args) {
        UserDAOCGlibProxy cglibProxy = new UserDAOCGlibProxy();
        UserDAOImpl userDao = (UserDAOImpl) cglibProxy.getInstance(new UserDAOImpl());
        userDao.findUser();
    }
}
