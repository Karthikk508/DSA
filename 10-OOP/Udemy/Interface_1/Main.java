package Udemy.Interface_1;

import org.w3c.dom.ls.LSException;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Bird bird = new Bird();

        Animal animal = bird;
        FlightEnabled flier = bird;
        Trackable tracked = bird;

        animal.move();
        //flier.move();

        flier.takeOff();
        flier.fly();
        tracked.track();
        flier.land();

        Jet jet = new Jet();
        inFlight(jet);
        //inFlight(flier);

        Truck truck = new Truck();
        truck.track();

        double kmsTravelled = 100;
        double milesTravelled = kmsTravelled * FlightEnabled.KM_TO_MILES;
        System.out.println(milesTravelled);


        ArrayList<FlightEnabled> fliers = new ArrayList<>();
        fliers.add(bird);

        List<FlightEnabled> betterFliers = new ArrayList<>();
        betterFliers.add(bird);

        triggerFliers(fliers);
        flyFliers(fliers);
        landFliers(fliers);
    }
    public static void inFlight(FlightEnabled flier)
    {
        flier.takeOff();
        flier.fly();
        flier.land();

        if(flier instanceof Trackable tracked)
        {
            tracked.track();
        }
    }

    public static void triggerFliers(List<FlightEnabled> fliers) {
        for(var flier : fliers)
        {
           flier.takeOff();
        }
    }
    public static void flyFliers(List<FlightEnabled> fliers) {
        for(var flier : fliers)
        {
            flier.fly();
        }
    }
    public static void landFliers(List<FlightEnabled> fliers) {
        for(var flier : fliers)
        {
            flier.land();
        }
    }
}
