package Applications.Taxi;

import com.karthik.access.A;

import java.util.*;

public class Booking {

    private static void bookTaxi(int id, char pickupPoint, char dropPoint, int pickupTime, List<Taxi> freeTaxis) {

        int min = Integer.MAX_VALUE;
        int earning = 0;
        int disBwPandD = 0;
        int nextFreeT = 0;
        char nextPoint = 'Z';

        String tripDetail = "";

        Taxi TaxiBooked = null;



        for(Taxi t : freeTaxis)
        {
            int curd = (Math.abs(pickupPoint - '0' - t.currentSpot - '0'))*15;
            if(curd < min)
            {
                TaxiBooked = t;
                disBwPandD = Math.abs((dropPoint - '0') - (pickupPoint - '0'))*15;
                earning = (disBwPandD - 5) * 10 + 100;
                int dropTime = pickupTime + disBwPandD/15;
                nextFreeT = dropTime;
                nextPoint = dropPoint;

                tripDetail = id + "               " + id + "          " + pickupPoint +  "      " + dropPoint + "       " + pickupTime + "          " +dropTime + "           " + earning;
                min = curd;
            }
        }
        TaxiBooked.getDetails(true,nextFreeT,nextPoint,earning,tripDetail);
        System.out.println("Taxi " + TaxiBooked.id + " booked");
    }


    private static List<Taxi> createTaxis(int n) {

        List<Taxi> taxis = new ArrayList<>();

        for (int j = 0; j < n; j++) {
            Taxi t = new Taxi();
            taxis.add(t);
        }
        return taxis;
    }
    private static List<Taxi> getFreeTaxis(List<Taxi> taxis,char pickupPoint, char dropPoint, int pickupTime) {

        List<Taxi> list = new ArrayList<>();

        for(Taxi t : taxis)
        {
            if(t.freeTime <= pickupTime && (Math.abs((t.currentSpot - '0') - (pickupPoint - '0'))) <= pickupTime - t.freeTime)
            {
                list.add(t);
            }
        }
        return list;
    }

    public static void main(String[] args) {

        List<Taxi> taxis = createTaxis(4);
        Scanner in = new Scanner(System.in);
        int id = 1;

        while(true)
        {
            System.out.println("0 -> Book taxi");
            System.out.println("1 -> print details");

            switch (in.nextInt())
            {
                case 0:
                {
                    int customerId = id;
                    System.out.println("Enter pickup point");
                    char pickupPoint = in.next().charAt(0);
                    System.out.println("Enter drop point");
                    char dropPoint = in.next().charAt(0);
                    System.out.println("Enter the timing");
                    int pickupTime = in.nextInt();

                    //Condition check
                    List<Taxi> freeTaxis = getFreeTaxis(taxis,pickupPoint,dropPoint,pickupTime);

                    if(freeTaxis.isEmpty())
                    {
                        System.out.println("Not available");
                        return;
                    }
                   Collections.sort(freeTaxis,(a,b) -> a.totalEarnings - b.totalEarnings);

                    bookTaxi(id,pickupPoint,dropPoint,pickupTime,freeTaxis);
                    id++;
                }
                break;
                case 1:
                {
                    //two functions to print details
                    for(Taxi t : taxis)
                        t.printTaxiDetails();
                    for(Taxi t : taxis)
                        t.printDetails();
                    break;
                }
                default:
                    return;
            }
        }
    }
}



