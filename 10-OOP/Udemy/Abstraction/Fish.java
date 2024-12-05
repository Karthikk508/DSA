package Udemy.Abstraction;

public  class Fish extends Animal {

    public Fish(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void move(String speed) {
        if(speed.equals("Slow"))
        {
            System.out.println(getExplicitType() + "Crawling");
        }
        else {
            System.out.println(getExplicitType() + "Panic");
        }
    }

    @Override
    public void makeNoise() {
        if (type.equals("Wolf")) {
            System.out.println(getExplicitType() + "Howling");
        } else {
            System.out.println(getExplicitType() + "Woof! ");
        }
    }
}
