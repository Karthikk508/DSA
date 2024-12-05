package Udemy.Abstraction;

public class Horse extends Mammals{


    public Horse(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void shedHairs() {

        System.out.println(getExplicitType() + "Sheds in spring");

    }

    @Override
    public void makeNoise() {

        System.out.println(getExplicitType() + "Maaaa");

    }
}
