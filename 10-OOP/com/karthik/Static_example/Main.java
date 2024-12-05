package com.karthik.Static_example;

public class Main {

    public static void main(String[] args) {

        Human karthik = new Human(21,0,"Santhosh",false);
        Human rahul = new Human(56,10000,"rahul",true);

        System.out.println(Human.population);
        System.out.println(karthik.age);
        System.out.println(rahul.age);
    }

    void greeting()
    {
        System.out.println("bye");
    }
}


