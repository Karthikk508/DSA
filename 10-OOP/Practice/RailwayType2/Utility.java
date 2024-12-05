package Practice.RailwayType2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class Utility {

    static ArrayList<Details> list = new ArrayList<>();
    static Queue<Details> queue = new LinkedList<>();
    static boolean[][] arr = new boolean[8][8];
    public static void book()
    {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the source station");
        char a = in.next().charAt(0);
        System.out.println("Enter the destination station");
        char b = in.next().charAt(0);
        System.out.println("Number of seats you want to book");
        int seats = in.nextInt();

        int s1 = a - 65;
        int d1 = b - 65;

        int n = seats;
        boolean flag = false;

        int row = 0;
        for(int i = 0; i<8; i++)
        {
            for (int j = s1; j <d1 ; j++) {
                flag = !arr[i][j];
                if(!flag)
                {
                    break;
                }
                if(flag && j == d1 - 1)
                {
                    row = i;
                    break;
                }
            }
            if(flag) break;
        }
        if(flag) {
            for (int i = row; i < 8 && n > 0; i++) {
                for (int j = s1; j < d1; j++) {
                    arr[i][j] = true;
                }
                n--;
            }
        }

        if(n > 0)
        {
            if(queue.size() > 2 || n > 2)
            {
                System.out.println("Tickets not available");
            }
            else {
                Details obj = new Details(a,b,seats);
                list.add(obj);
                queue.add(obj);
            }
        }
        Details obj = new Details(a,b,seats);
        list.add(obj);
    }
    public static void printTickets(int id)
    {
        boolean flag = true;

        for (int i = 0; i < list.size(); i++) {

            if(list.get(i).pId == id) {
                System.out.println("Passenger id          : " + list.get(i).pId);
                System.out.println("Your ticket number is : " + list.get(i).number);
                System.out.println("Source station        : " + list.get(i).source);
                System.out.println("Final destination     : " + list.get(i).destination);
                System.out.println("Number of seats booked: " + list.get(i).numberOfSeats);
                flag = false;
            }

        }
        if(flag) System.out.println("Id not found");
    }
    public static void print() {
        System.out.print(" ");
        for (int i = 0; i < Utility.arr[0].length; i++) {
            System.out.print(" " + (char) (i + 65));
        }
        System.out.println();

        for (int i = 0; i < Utility.arr.length; i++) {

            for (int j = 0; j < Utility.arr[0].length; j++) {

                if (j == 0) {
                    System.out.print((i + 1) + " ");
                }

                if (Utility.arr[i][j]) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }
}




//        for(int i = 0; i<8 && n>0; i++)
//        {
//            for (int j = s1; j <d1 ; j++) {
//
//                if(arr[i][j])
//                {
//                    for (int k = s1; k < d1; k++) {
//                        arr[i][k] = false;
//                    }
//                    break;
//                }
//                if(i == 7 && arr[i][j]){
//                    System.out.println("Tickets not available");
//                    break;
//                }
//                arr[i][j] = true;
//
//                if(j == d1 - 1) n--;
//            }
//        }


//        for (int i = 0; i < Booking.arr.length; i++) {
//            for (int j = 0; j < Booking.arr[0].length; j++) {
//                System.out.print(Booking.arr[i][j] + " ");
//            }
//            System.out.println();
//        }