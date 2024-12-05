package OOPS.Keywords.Super;


import java.util.ArrayList;
import java.util.List;

class Person {

    List<String> studentList = new ArrayList<>();

    Person()
    {
        System.out.println("Person class Constructor");
    }
    Person(String name, int age)
    {
        System.out.println(name);
        System.out.println(age);
    }
    Person(List<String> list){
        this.studentList = list;
    }
}


class Student extends Person {

    Student()
    {
        super("karthik",20);
        System.out.println("Student class Constructor");
    }

    Student(List<String> list) {
        super(list);
    }
}


class Student3 extends Person {


    Student3(List<String> list) {
        super(list);
    }
}



public class Super_wih_constructor {


    public static void main(String[] args)
    {
        Student s = new Student();


        List<String> group1 = new ArrayList<>();

        group1.add("karthik");
        group1.add("sachin");
        group1.add("ravi");
        group1.add("rahul");

        Student s1 = new Student(group1);

        Person person = new Person();

        System.out.println(person.studentList);

        System.out.println(s1.studentList);

        Student3 student3 = new Student3(group1);
        System.out.println(student3.studentList + " STUDENT3");
    }
}
