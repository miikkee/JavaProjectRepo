package com.company;

/**
 * @Author KAY
 * @create {YEAR}-{MONTH}-{DAY}  {TIME}
 */
public class PersonImpl  implements  Person{

    @Override
    public void showName() {
        System.out.println("I'am  personImpl showName");
    }

    @Override
    public void saying() {
        System.out.println("I'am  personImpl saying");
    }
}
