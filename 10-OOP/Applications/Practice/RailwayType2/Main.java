package Applications.Practice.RailwayType2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        while(true) {
            System.out.println("1 : book ticket");
            System.out.println("2 : print tickets");
            System.out.println("3 : booked history");
            int num = in.nextInt();

            switch (num) {
                case 1:
                    Utility.book();
                    break;

                case 2:
                    System.out.println("Enter passenger id :");
                    int id = in.nextInt();
                    Utility.printTickets(id);
                    break;

                case 3:
                    Utility.print();
                    break;

                default:
                    break;
            }
            if (num == 3) break;
        }
    }
}
