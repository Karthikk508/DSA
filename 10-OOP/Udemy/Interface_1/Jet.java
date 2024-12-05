package Udemy.Interface_1;

public class Jet implements FlightEnabled,Trackable{

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

    @Override
    public FlightStages transition(FlightStages stages) {

        //return FlightEnabled.super.transition(stages);
        System.out.println(this.getClass().getSimpleName() + " transitioning");
        return FlightEnabled.super.transition(stages);

    }

}
