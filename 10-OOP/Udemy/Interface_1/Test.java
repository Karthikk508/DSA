package Udemy.Interface_1;

public class Test {

    public static void main(String[] args) {

        //inFlight(new Jet());

       // OrbitEarth.log(new Satellite().toString());

        orbit(new Satellite());

    }
    public static void inFlight(FlightEnabled flier)
    {
        flier.takeOff();
        flier.fly();
        flier.land();

        flier.transition(FlightStages.LAUNCH);

        if(flier instanceof Trackable tracked)
        {
            tracked.track();
        }
    }
    public static void orbit(OrbitEarth flier)
    {
        flier.takeOff();
        flier.fly();
        flier.land();
    }
}
