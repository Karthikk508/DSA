package com.karthik.Introduction;

public class OOP1 {

    public static void main(String[] args) {

        Student s = new Student();
        s.roll_no = 25;
        s.name = "Santhosh";
        s.n = 100.253f;

        System.out.println(s.roll_no);
        System.out.println(s.name);
        System.out.println(s.n);

        Student karthik = new Student();
        karthik.name = "Karthi";

        System.out.println(karthik.name);

        Student karthi = new Student(1,"Sandy",1.0234f);
        System.out.println(karthi.roll_no);
        System.out.println(karthi.n);
        System.out.println(karthi.name);

        Student random = new Student();
        System.out.println(random.name);

        Student random2 = new Student();
        System.out.println(random2.name);

        Student snack = new Student(karthik);
        System.out.println(snack.name);
        System.out.println(snack.n);
        System.out.println(snack.roll_no);

    }
}
class Student{
    int roll_no = 0;
    String name = "karthik";
    float n = 2.356f;
    Student(int r , String n, float s)
    {
        this.roll_no = r;
        this.name = n;
        this.n = s;
        greeting();
    }
    Student(Student other) {
        this.name = other.name;
        this.roll_no = other.roll_no;
        this.n = other.n;
    }

    Student () {
        // this is how you call a constructor from another constructor
        // internally: new Student (13, "default person", 100.0f);
        this (13, "default person", 100.0f);
    }

    void greeting() {
        System.out.println("Hello! My name is " + this.name);
    }

    void changeName(String name) {
        this.name = name;
    }


    //    Student(){
//
//        this.roll_no = 10;
//        this.name = "karthikeyan";
//        this.n = 2.122f;
//    }

}
