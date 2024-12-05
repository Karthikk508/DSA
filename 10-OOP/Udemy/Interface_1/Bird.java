package Udemy.Interface_1;

public class Bird extends Animal implements FlightEnabled , Trackable {


    @Override
    public void move() {
        System.out.println("Flappy wings");
    }

    @Override
    public void takeOff() {
        System.out.println(getClass().getSimpleName() + " taking off");
    }

    @Override
    public void land() {
        System.out.println(getClass().getSimpleName() + " landing");
    }

    @Override
    public void fly() {
        System.out.println(getClass().getSimpleName() + " flying");
    }


    @Override
    public void track() {
        System.out.println(getClass().getSimpleName() + " Tracked at xyz direction");
    }
}
