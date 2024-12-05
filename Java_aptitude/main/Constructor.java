package main;

public class Constructor {
    // Declaring and initializing integer with custom value
    int x = 2;

    // Constructor of this class
    // Parameterized constructor
    Constructor(int i) { x = i; }

    // Main driver method
    public static void main(String[] args)
    {

        // Creating object of class in main()
         Constructor t = new Constructor(5);

        // Printing the value
        System.out.println("x = " + t.x);
    }
}
