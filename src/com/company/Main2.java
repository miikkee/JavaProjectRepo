package com.company;

/**
 * @Author KAY
 * @create {YEAR}-{MONTH}-{DAY}  {TIME}
 */
public class Main2 {

    public static void main(String[] args) {
        Person person = new PersonImpl();
        person.showName();
        person.saying();
        System.out.println(person);
        System.out.println(person.toString());
        System.out.println(person.getClass());
    }
}
