package Applications.Practice.Train;

import java.lang.reflect.WildcardType;
import java.util.LinkedList;
import java.util.Queue;
import java.util.*;

public class TicketBooker {

    static int availLowerBerth = 1;
    static int availMiddleBerth = 1;
    static int availUpperBerth = 1;
    static int availRac = 1;
    static int availWaiting = 1;

    static Queue<Integer> waitingList = new LinkedList<>();
    static Queue<Integer> racList = new LinkedList<>();
    static List<Integer> bookedTicketList = new ArrayList<>();

    //Available positions
    static List<Integer> UpperBerthPositions = new ArrayList<>(Arrays.asList(1));
    static List<Integer> MiddleBerthPositions = new ArrayList<>(Arrays.asList(1));
    static List<Integer> LowerBerthPositions = new ArrayList<>(Arrays.asList(1));
    static List<Integer> RacPositions = new ArrayList<>(Arrays.asList(1));
    static List<Integer> WaitingLPositions = new ArrayList<>(Arrays.asList(1));

    static Map<Integer,Passenger> passengers = new HashMap<>();

    public static void addToRac(Passenger person, int poll, String rac) {
        person.number = poll;
        person.alloted = rac;
        passengers.put(person.passengerId,person);
        racList.add(person.passengerId);
        RacPositions.remove(0);
        availRac--;
        System.out.println("................................RAC");
    }

    public static void addToWaitingList(Passenger person, int poll, String w) {

        person.number = poll;
        person.alloted = w;
        passengers.put(person.passengerId,person);
        waitingList.add(person.passengerId);
        WaitingLPositions.remove(0);
        availWaiting--;
        System.out.println("................................Waiting");
    }

    public void bookTicket(Passenger person, int birthNo, String l) {

        person.number = birthNo;
        person.alloted = l;
        passengers.put(person.passengerId,person);
        bookedTicketList.add(person.passengerId);
        System.out.println("................................Booked Successfully");
    }

    public void cancelTicket(int id) {

        Passenger person = passengers.get(id);
        passengers.remove(id);
        bookedTicketList.remove(id);

        int bookedPosition = person.number;

        System.out.println("Cancelled successfully");

        String bookedBirth = person.alloted;

        if(bookedBirth.equals("U"))
        {
            availUpperBerth++;
            UpperBerthPositions.add(bookedPosition);
        }
        else if(bookedBirth.equals("M"))
        {
            availMiddleBerth++;
            MiddleBerthPositions.add(bookedPosition);
        }
        else if(bookedBirth.equals("L"))
        {
            availLowerBerth++;
            LowerBerthPositions.add(bookedPosition);
        }

        if(!racList.isEmpty())
        {
            Passenger p = passengers.get(racList.poll());
            int positionRac = p.number;
            RacPositions.add(positionRac);
            racList.remove(p.passengerId);
            availRac++;

            if(!waitingList.isEmpty())
            {
                Passenger pw = passengers.get(waitingList.poll());
                int posWait = pw.number;
                WaitingLPositions.add(posWait);
                waitingList.remove(pw.passengerId);

                pw.number = RacPositions.get(0);
                pw.alloted = "RAC";
                RacPositions.remove(0);
                racList.add(pw.passengerId);

                availWaiting++;
                availRac--;
            }
            Main.bookTicket(p);
        }
    }
    public void printAvailable() {

        System.out.println("AvailbleLower : " + availLowerBerth);
        System.out.println("AvailbleMiddle : " + availMiddleBerth);
        System.out.println("AvailbleUpper : " + availUpperBerth);
        System.out.println("AvailbleRac : " + availRac);
        System.out.println("AvailbleWaiting : " + availWaiting);

    }
    public void Booked()
    {
        if(passengers.isEmpty())
        {
            System.out.println("Not available");
            return;
        }

        for(Passenger p : passengers.values())
        {
            System.out.println("id : " + p.passengerId);
            System.out.println("Name : " + p.name);
            System.out.println("Age : " + p.age);
            System.out.println("Num : " + p.number);
            System.out.println("Birth : " + p.alloted);
        }
    }
}
