package com.company;

/**
 * @Author KAY
 * @create {YEAR}-{MONTH}-{DAY}  {TIME}
 */
public class Main3 {

    public static void main(String[] args) {
        Person person = new PersonImpl();
        Person proxy =(Person) new PersonProxy(person).CreatProxyedObj();
        proxy.saying();
        System.out.println(proxy);
        System.out.println(proxy.toString());
        System.out.println(person);
    }
}
