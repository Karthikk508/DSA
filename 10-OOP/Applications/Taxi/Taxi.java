package Applications.Taxi;

import java.util.ArrayList;
import java.util.List;

public class Taxi {

    static int taxiCount = 1;
    int id;
    boolean booked;
    char currentSpot;
    int freeTime;
    int totalEarnings;
    List<String> trips;


    public Taxi()
    {
        booked = false;
        currentSpot = 'A';
        freeTime = 6;
        totalEarnings = 0;
        trips = new ArrayList<>();
        id = taxiCount++;
    }


    public void getDetails(boolean b, int nextFreeT, char nextPoint, int earning, String tripDetail) {

        this.booked = b;
        this.currentSpot = nextPoint;
        this.freeTime = nextFreeT;
        this.totalEarnings = earning;
        this.trips.add(tripDetail);

    }
    public void printDetails()
    {
        //print all trips details
        System.out.println("Taxi - "+ this.id + " Total Earnings - " + this.totalEarnings);
        System.out.println("TaxiID    BookingID    CustomerID    From    To    PickupTime    DropTime    Amount");
        for(String trip : trips)
        {
            System.out.println(id + "          " + trip);
        }
        System.out.println("--------------------------------------------------------------------------------------");
    }

    public void printTaxiDetails()
    {
        //print total earning and taxi details like current location and free time
        System.out.println("Taxi - "+ this.id + " Total Earnings - " + this.totalEarnings + " Current spot - " + this.currentSpot +" Free Time - " + this.freeTime);
    }
}
