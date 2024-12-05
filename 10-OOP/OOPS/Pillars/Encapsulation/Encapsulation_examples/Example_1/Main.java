package OOPS.Pillars.Encapsulation.Encapsulation_examples.Example_1;

public class Main {

    public static void main(String[] args) {

        Person person = new Person();
        person.setName("Karthik");
        person.setAge(20);

        System.out.println(person.getName());
        System.out.println(person.getAge());
    }
}
