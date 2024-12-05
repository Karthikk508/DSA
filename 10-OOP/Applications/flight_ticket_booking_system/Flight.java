import java.util.*;

public class Flight {
    static int id = 1;
    int flightID;
    int tickets;
    int price;
    ArrayList<Passenger> passengers;

    Flight() {
        tickets = 50;
        price = 5000;
        flightID = id;
        id = id + 1;
        passengers = new ArrayList<Passenger>();
    }

    // add passenger details to flight.

    public void addPassengerDetails(String passengerDetail, int numberOfTickets, int passengerID) {
        int totalCost = numberOfTickets * price;
        // storing the data into the Passenger datatype.
        Passenger pass = new Passenger(passengerID, numberOfTickets, totalCost, passengerDetail);
        passengers.add(pass);
        tickets -= numberOfTickets;
        price += 200 * numberOfTickets;

        System.out.println("Booked Successfully!");
    }

    public void cancelTicket(int passengerID) {
        for (int i = 0; i < passengers.size(); i++) {
            if (passengers.get(i).passengerID == passengerID) {
                tickets += passengers.get(i).bookedTicketsPerPassenger;
                System.out.println("Refund amount: " + passengers.get(i).passengerCost);
                price -= 200 * passengers.get(i).bookedTicketsPerPassenger;
                passengers.remove(i);
                return;
            }
        }
        System.out.println("Passenger ID not found");
    }

    public boolean check()
    {
        for(Passenger passenger:passengers)
        {
            if(passenger != null)
            {
                return false;
            }
        }
        return true;
    }

    public void flightSummary() {
        System.out.println("Flight ID: " + this.flightID + "\n <--------------->\n ");
        System.out.println("Remaining Tickets: " + this.tickets + "\n <--------------->\n ");
        System.out.println("Current Ticket Price: " + this.price + "\n <--------------->\n ");
    }

    public void printDetails() {
        System.out.println("Flight ID: " + this.flightID + " <---------------> ");
        for (int i = 0; i < passengers.size(); i++) {
            System.out.println(passengers.get(i).passengerDetail);
        }
    }

}