public class Passenger 
{
    int passengerID;
    int bookedTicketsPerPassenger;
    int passengerCost;
    String passengerDetail;

    public Passenger(int passengerID, int bookedTicketsPerPassenger, int passengerCost, String passengerDetail) {
        this.passengerID = passengerID;
        this.bookedTicketsPerPassenger = bookedTicketsPerPassenger;
        this.passengerCost = passengerCost;
        this.passengerDetail = passengerDetail;
    }
}
