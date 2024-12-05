package com.karthik.Static_example;

public class Human {
    int age;
    int salary;
    String name;
    boolean marital;
    static int population;
    public Human (int age ,int salary,String name,boolean marital)
    {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.marital = marital;
        population++;
    }

}
