package OOPS.Keywords.Super;


class Person1 {
    void message()
    {
        System.out.println("This is person class\n");
    }
}

class Student1 extends Person1 {
    void message()
    {
        System.out.println("This is student class");
    }
    void display()
    {

        message();
        super.message();
    }
}

public class Super_with_method {
    public static void main(String args[])
    {
        Student1 s = new Student1();
        s.display();
    }
}
