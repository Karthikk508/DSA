package OOPS.Pillars.Inheritance.Inheritance_examples;



class Employee {
    int salary = 60000;
}

class Engineer extends Employee {
    int benefits = 10000;
}

class Example_2 {
    public static void main(String[] args)
    {
        Engineer E1 = new Engineer();
        System.out.println("Salary : " + E1.salary + "\nBenefits : " + E1.benefits);
    }
}
