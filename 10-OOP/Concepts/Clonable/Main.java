package Concepts.Clonable;

class MyClass implements Cloneable {
    int x;
    String y;

    // Constructor
    public MyClass(int x, String y) {
        this.x = x;
        this.y = y;
    }

    // Overriding clone() method
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone(); // Calls the Object class's clone() method
    }
}

public class Main {
    public static void main(String[] args) {
        MyClass obj1 = new MyClass(10, "hello");

        try {
            MyClass obj2 = (MyClass) obj1.clone(); // Cloning the object
            System.out.println(obj2.x); // 10
            System.out.println(obj2.y); // "hello"
        } catch (CloneNotSupportedException e) {
            System.out.println("Cloning not supported");
        }
    }
}