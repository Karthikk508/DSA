package Udemy.Interface_1;

public class Truck implements Trackable{

    @Override
    public void track() {
        System.out.println(getClass().getSimpleName() + " Tracked at xyz direction");
    }
}
