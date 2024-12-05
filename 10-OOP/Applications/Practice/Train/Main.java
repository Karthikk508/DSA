package Applications.Practice.Train;

import java.util.Scanner;


public class Main {

    public static void bookTicket(Passenger person) {

        TicketBooker booker = new TicketBooker();

        if(TicketBooker.availWaiting == 0)
        {
            System.out.println("Sorry tickets sold");
            return;
        }
        if(person.birthPreference.equals("U") && TicketBooker.availUpperBerth > 0 ||
                person.birthPreference.equals("M") && TicketBooker.availMiddleBerth > 0 ||
                person.birthPreference.equals("L") && TicketBooker.availLowerBerth > 0)
        {
            System.out.println("Preferred birth available");

            if(person.birthPreference.equals("L"))
            {
                System.out.println("Lower birth given");
                booker.bookTicket(person,(TicketBooker.LowerBerthPositions.get(0)),"L");
                TicketBooker.LowerBerthPositions.remove(0);
                TicketBooker.availLowerBerth--;
            }
            else if(person.birthPreference.equals("U"))
            {
                System.out.println("Upper birth given");
                booker.bookTicket(person,(TicketBooker.UpperBerthPositions.get(0)),"U");
                TicketBooker.UpperBerthPositions.remove(0);
                TicketBooker.availUpperBerth--;
            }
            else if(person.birthPreference.equals("M")) {
                System.out.println("Middle birth given");
                booker.bookTicket(person, (TicketBooker.MiddleBerthPositions.get(0)), "M");
                TicketBooker.MiddleBerthPositions.remove(0);
                TicketBooker.availMiddleBerth--;
            }
        }
        else if(TicketBooker.availLowerBerth > 0)
        {
            System.out.println("Lower birth given");
            booker.bookTicket(person,(TicketBooker.LowerBerthPositions.get(0)),"L");
            TicketBooker.LowerBerthPositions.remove(0);
            TicketBooker.availLowerBerth--;
        }
        else if(TicketBooker.availMiddleBerth > 0)
        {
            System.out.println("Middle birth given");
            booker.bookTicket(person,(TicketBooker.MiddleBerthPositions.get(0)),"M");
            TicketBooker.MiddleBerthPositions.remove(0);
            TicketBooker.availMiddleBerth--;
        }
        else if(TicketBooker.availUpperBerth > 0) {
            System.out.println("Upper birth given");
            booker.bookTicket(person, (TicketBooker.UpperBerthPositions.get(0)), "U");
            TicketBooker.UpperBerthPositions.remove(0);
            TicketBooker.availUpperBerth--;
        }
        else if(TicketBooker.availRac > 0)
        {
            System.out.println("Rac available");
            TicketBooker.addToRac(person,(TicketBooker.RacPositions.get(0)),"RAC");

        }
        else if(TicketBooker.availWaiting > 0)
        {
            System.out.println("Wait pandra");
            TicketBooker.addToWaitingList(person,(TicketBooker.WaitingLPositions.get(0)),"WL");

        }
    }
    private static void cancelTicket(int id) {

        TicketBooker booker = new TicketBooker();
        if(TicketBooker.passengers.containsKey(id))
        {
            booker.cancelTicket(id);
        }
        else {
            System.out.println("Yara ne");
        }
    }
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        while(true)
        {
            System.out.println(" 1.Book ticket \n 2.Cancel ticket \n 3.Available ticket \n 4.Booked tickets \n 5.Exit");
            int n = in.nextInt();

            switch (n)
            {
                // Booking
                case 1:
                {
                    System.out.println("Enter passenger name,age,birthPreference");

                    String name = in.next();
                    int age = in.nextInt();
                    String birthPreference = in.next();
                    Passenger person = new Passenger(name,age,birthPreference);
                    bookTicket(person);

                }
                break;
                //cancel ticket
                case 2:
                {
                    System.out.println("Enter the passenger id");
                    int id = in.nextInt();
                    cancelTicket(id);
                }
                break;
                case 3:
                {
                    TicketBooker booker = new TicketBooker();
                    booker.printAvailable();
                }
                break;
                case 4:
                {
                    TicketBooker booker = new TicketBooker();
                    booker.Booked();
                }
                break;
                case 5:
                {
                    break;
                }

            }
        }
    }
}
