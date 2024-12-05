package OnlineShoppingApp;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {



        //case :1

        Scanner in = new Scanner(System.in);

        System.out.println("Enter the username");

        String username = in.next();

        System.out.println("Enter the password");

        String password = in.next();

        String encrypted = "";

        for (int i = 0; i < password.length(); i++) {

            System.out.print(password);

        }

        

        for (int i = 0; i < password.length(); i++) {

            if(password.charAt(i) == 'z')
            {
                encrypted += 'a';
            }
            else {
                encrypted += ((password.charAt(i) - 97) + 1);
                System.out.println('a' - 97);
            }
        }

        Admin.mapAdmin.put(username,encrypted);

        System.out.println(encrypted);




    }
}
