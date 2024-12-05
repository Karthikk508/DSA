package Udemy.Abstraction;


abstract class Mammals extends Animal{


    public Mammals(String type, String size, double weight) {
        super(type, size, weight);
    }

    public void move(String speed)
    {
        System.out.print(getExplicitType() + " ");
        System.out.println(speed.equals("Slow") ? "Walking" : "Running");
    }

    public abstract void shedHairs();
}
public abstract class Animal {


    protected String type;
    private String size;
    private double weight;

    public Animal(String type, String size, double weight) {
        this.type = type;
        this.size = size;
        this.weight = weight;
    }


    public abstract void move(String speed);
    public abstract void makeNoise();

    final String getExplicitType()
    {
        return getClass().getSimpleName() + "(" + type + ")";
    }


}
