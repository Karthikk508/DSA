package OOPS.Keywords.This;

public class Person {

    // Fields Declared
    String name;
    int age;

    // Constructor
    Person(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    // Getter for name
    public String get_name() { return name; }

    // Setter for name
    public void change_name(String name)
    {
        this.name = name;
    }

    // Method to Print the Details of
    // the person
    public void printDetails()
    {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println();
    }

    // main function
    public static void main(String[] args)
    {
        // Objects Declared
        Person first = new Person("ABC", 18);
        Person second = new Person("XYZ", 22);

        first.printDetails();
        second.printDetails();

        first.change_name("PQR");
        System.out.println("Name has been changed to: "
                + first.get_name());

        System.out.println(first.get_name());
    }
}
