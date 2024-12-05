package Udemy.Abstraction;

public class Dog extends Animal {


    public Dog(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void move(String speed) {
        System.out.println(getExplicitType() + speed);
    }

    @Override
    public void makeNoise() {
        if(type.equals("Wolf"))
        {
            System.out.println(getExplicitType() + "Howling");
        }
        else{
            System.out.println(getExplicitType() + "Woof! ");
        }
    }
//    @Override
//    public String getExplicitType()
//    {
//        System.out.println("hhello");
//        return "";
//    }
}
