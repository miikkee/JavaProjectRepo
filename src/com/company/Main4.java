package com.company;

import java.lang.reflect.Proxy;
import java.util.Properties;

/**
 * @Author KAY
 * @create {YEAR}-{MONTH}-{DAY}  {TIME}
 */
public class Main4 {
    public static void main(String[] args) {
        //保留动态代理生成得类
        Properties properties = System.getProperties();
        properties.put("sun.misc.ProxyGenerator.saveGeneratedFiles","true");
        //通过动态代理为接口生成实现类
        Dog person = (Dog) Proxy.newProxyInstance(Dog.class.getClassLoader(),new Class[]{Dog.class}, new InvokeHandler());
        person.showName();
        System.out.println(person);
        System.out.println(person.toString());
        System.out.println(person.getClass());
    }
}
