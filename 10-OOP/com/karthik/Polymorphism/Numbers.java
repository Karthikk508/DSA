package com.karthik.Polymorphism;

public class Numbers {

    //Method overloading

    int sum(int a,int b)
    {
        return a+b;
    }
    int sum(int a,int b,int c)
    {
        return a+b+c;
    }

    public static void main(String[] args) {
        Numbers num = new Numbers();

        System.out.println(num.sum(4,5));
        System.out.println(num.sum(1,2,3));
    }

}
