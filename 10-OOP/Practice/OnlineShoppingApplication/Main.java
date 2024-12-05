package Practice.OnlineShoppingApplication;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        User obj1 = new User();


        while(true)
        {
            Scanner in = new Scanner(System.in);
            int input = in.nextInt();

            switch (input)
            {
                case 1:
                    obj1.register();
                    break;
                case 2:
                    System.out.println("hi");
                    break;
                default:
                    break;
            }

        }



    }
}
