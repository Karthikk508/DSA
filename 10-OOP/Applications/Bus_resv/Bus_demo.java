package Applications.Bus_resv;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class Bus_demo {

    public static void main(String[] args) {

        int userInp = 1;

        Scanner in = new Scanner(System.in);

        ArrayList<Bus> buses = new ArrayList<>();
        ArrayList<Booking> bookings = new ArrayList<>();

        buses.add(new Bus(0,true,2));
        buses.add(new Bus(1,false,50));
        buses.add(new Bus(2,true,30));

        for(Bus b : buses)
        {
            b.display_info();
        }

        while(userInp == 1)
        {
            System.out.println("Enter 1 to book and 2 to exit");

            userInp = in.nextInt();

            if(userInp == 1)
            {
                Booking booking = new Booking();

                if(booking.isAvailabe(bookings,buses))
                {
                    bookings.add(booking);
                    System.out.println("Your booking is confirmed");
                }
                else {
                    System.out.println("Sorry bus is full try another bus or another date");
                }
            }
            else {
                System.out.println("Thank you : good day");
            }

        }

    }
}
