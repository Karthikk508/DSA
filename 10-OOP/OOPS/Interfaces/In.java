package OOPS.Interfaces;

public interface In {

    final int a = 10;
    void display();
}

class TestClass2 implements In{

    public void display()
    {
        System.out.println("karthik");
    }
}


class TestClass implements In {

    public void display() {
        System.out.println("Geek");
    }
}


class Main{

    public static void main(String[] args) {

//        TestClass t = new TestClass();
//
//        In t1 = new TestClass();
//        In t2 = new TestClass2();
//
//        t1.display();
//        t2.display();

        TestClass t = new TestClass();
        t.display();
        System.out.println(t.a);

    }
}