package Applications.Bus_resv;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
public class Booking {

    String passenger_name;
    int busNo;
    Date date;

    Booking() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter passenger name : ");
        passenger_name = in.next();
        System.out.println("Enter bus no : ");
        busNo = in.nextInt();
        System.out.println("Enter the date : dd/mm/yyyy");
        String dateInput = in.next();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/mm/yyyy");
        try {
            date = dateFormat.parse(dateInput);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }


    public boolean isAvailabe(ArrayList<Booking> bookings, ArrayList<Bus> buses) {

        int capacity = 0;
        for(Bus bus : buses)
        {
            if(busNo == bus.getBusNo())
            {
                capacity = bus.getCapacity();
            }
        }

        int booked = 0;

        for(Booking b : bookings)
        {
            if(b.busNo == busNo && b.date.equals(date))
            {
                booked++;
            }
        }
        return booked < capacity;
    }
}
