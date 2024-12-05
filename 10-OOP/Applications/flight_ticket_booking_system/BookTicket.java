import java.util.*;

public class BookTicket {

    public static void book(Flight currentFlight, int tickets, int passengerID) {
        String passengerDetail = "";

        // store the passeger detail in a string
        passengerDetail = "Passenger ID: " + passengerID + "\n" + "Number of tickets booked: " + tickets + "\n"
                + "Total Cost: " + currentFlight.price * tickets;

        // add passenger detail to flight object
        currentFlight.addPassengerDetails(passengerDetail, tickets, passengerID);

        currentFlight.flightSummary();
        currentFlight.printDetails();

    }

    public static void cancel(Flight currentFlight, int passengerID) {
        currentFlight.cancelTicket(passengerID);
        currentFlight.flightSummary();
    }

    public static void print(Flight f) {
        f.printDetails();
    }

    public static boolean check(Flight f) {
        if (f.check()) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        ArrayList<Flight> flights = new ArrayList<Flight>();

        for (int i = 0; i < 3; i++) {
            flights.add(new Flight());
        }

        int passengerID = 1;

        while (true) {
            System.out.println("1.Book");
            System.out.println("2.Cancel");
            System.out.println("3.Print");
            Scanner in = new Scanner(System.in);
            int choice = in.nextInt();

            switch (choice) {
                // booking
                case 1: {
                    System.out.println("Enter Flight ID: ");
                    int fid = in.nextInt();

                    // check if flightid is valid
                    if (fid > flights.size()) {
                        System.out.println("Invalid Flight Id");
                        break;
                    }
                    Flight currentFlight = null;
                    for (Flight f : flights) {
                        if (fid == f.flightID) {
                            currentFlight = f;
                            f.flightSummary();
                            break;
                        }
                    }

                    System.out.println("Enter number of tickets: ");
                    int t = in.nextInt();

                    if (t > currentFlight.tickets) {
                        System.out.println("Not Enough Tickets");
                        break;
                    }

                    // call book function to book tickets
                    book(currentFlight, t, passengerID);

                    // increment passenger ID
                    passengerID = passengerID + 1;
                    break;
                }
                // cancel
                case 2: {
                    System.out.println("Enter FlightID and passengerID to cancel: ");
                    int fid = in.nextInt();

                    if (fid > flights.size()) {
                        System.out.println("Invalid Flight ID");
                        break;
                    }

                    Flight currentFlight = null;
                    for (Flight f : flights) {
                        if (f.flightID == fid) {
                            currentFlight = f;
                            break;
                        }
                    }

                    int id = in.nextInt();

                    cancel(currentFlight, id);
                    break;
                }
                // print details of the flight along with passenger details

                case 3: {
                    for (Flight f : flights) {
                        if (check(f)) {
                            System.out.println("No passenger details available in this flight ID  --" + f.flightID);
                        } else {
                            print(f);
                        }
                    }
                }
            }

        }

    }
}
