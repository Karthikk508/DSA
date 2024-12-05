package Practice.GiftCard;

import java.util.ArrayList;

public class Login {
    public static Customer find(String email,String password,ArrayList<Customer> arr)
    {
        password = Password.encrypt(password);

        for(int i = 0; i<arr.size(); i++)
        {
            if(email.equals(arr.get(i).email) && password.equals(arr.get(i).password))
            {
                return arr.get(i);
            }
        }
        return null;
    }
    public static void printDetails(Customer obj)
    {
        System.out.println("-------------------------------------");
        System.out.println("Your customer id is : " + obj.cusId);
        System.out.println("Your registered mail id : " + obj.email);
        System.out.println("Available balance : " + obj.balance);
    }
}
