package com.company;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author KAY
 * @create {YEAR}-{MONTH}-{DAY}  {TIME}
 */
public class PersonProxy implements InvocationHandler {

    private Object obj;

    public PersonProxy(Object obj) {
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable
    {
        // 这里可以做增强
        System.out.println("收钱");

        Object result = method.invoke(obj, args);

        return result;
    }

    // 生成代理类
    public Object CreatProxyedObj()
    {
        return Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(), this);
    }

}
