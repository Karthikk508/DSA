package Practice.OnlineShoppingApplication;

import java.util.HashMap;
import java.util.Scanner;

public class User {

    Scanner in = new Scanner(System.in);

    HashMap<String,Customer> map = new HashMap<>();
    public void register()
    {
        System.out.println("Enter your name,email,mobileNumber,password");

        String name = in.next();
        String email = in.next();
        String mobileNumber = in.next();
        String password = in.next();
        Customer obj = new Customer(name,email,mobileNumber,password,"customer");

        if(map.get(name) == null)
        {
            map.put(name,obj);
            System.out.println("User registered successfully");
        }
        else {
            System.out.println("User already exist");
        }

    }
}
