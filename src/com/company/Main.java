package com.company;

import java.lang.reflect.Proxy;
import java.util.Properties;

public class Main {

    public static void main(String[] args) {
        //保留动态代理生成得类
        Properties properties = System.getProperties();
        properties.put("sun.misc.ProxyGenerator.saveGeneratedFiles","true");
        //通过动态代理为接口生成实现类
        Person person = (Person) Proxy.newProxyInstance(Person.class.getClassLoader(),new Class[]{Person.class}, new InvokeHandler());
        person.showName();
        person.saying();
        System.out.println(person);
        System.out.println(person.toString());
        System.out.println(person.getClass());
    }
}
