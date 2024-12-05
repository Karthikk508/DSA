package Practice.GiftCard;

import javax.swing.text.DefaultEditorKit;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Customer> acc1 = new ArrayList<>();
    static ArrayList<String> transC = new ArrayList<>();

    public static void main(String[] args) {

        Customer obj1 = new Customer("karthik@gmail.com","happy26",500);
        transC.add("Amount credited  : 500");
        Customer obj2 = new Customer("sandy@gmail.com","sad26",500);
        Customer obj3 = new Customer("moorthy@gmail.com","excited26",500);

        ArrayList<Customer> details = new ArrayList<>();
        details.add(obj1);
        details.add(obj2);
        details.add(obj3);

        Scanner in = new Scanner(System.in);


        while(true)
        {
            System.out.println("1 : Login");
            System.out.println("3 : Exit");
            int i = in.nextInt();

            switch (i)
            {
                case 1:
                    System.out.println("Enter customer email :");
                    String email = in.next();
                    System.out.println("Enter password");
                    String password = in.next();
                    Customer flag = Login.find(email,password,details);

                    if(flag != null) {

                        Login.printDetails(flag);

                        while(true) {


                            System.out.println();
                            System.out.println("1 : Create Gift Card");
                            System.out.println("2 : TopUp");
                            System.out.println("3 : Transaction History");
                            System.out.println("4 : Block");
                            System.out.println("5 : Logout");

                            int in1 = in.nextInt();
                            int k = 0;

                            switch (in1) {
                                case 1:
                                    create();
                                    break;

                                case 2:
                                    System.out.println("Enter gift card number :");
                                    String number = in.next();
                                    System.out.println("Enter the amount you want to add : ");
                                    int amount = in.nextInt();
                                    topUp(amount, flag, number);
                                    break;

                                case 3:
                                    history();
                                    break;

                                case 4:
                                    System.out.println("Enter the number of the gift card that you want to delete");
                                    String num = in.next();
                                    block(flag, num);
                                    break;

                                case 5:
                                    i = 3;
                                    k = 5;
                                    System.out.println("logged out successfully");
                                    break;

                                default:
                                    break;
                            }

                            if(k == 5) break;

                        }

                    }
                    else {
                        System.out.println("Invalid credentials");
                    }

                break;

                case 2:
                    System.out.println("Null");
                break;

                default:
                    break;

            }
            if(i == 3) break;
        }
    }
    public static void create()
    {
        Customer gf = new Customer("ABCDEFG");
        System.out.println("Gift card successfully created and the number is : " + gf.number);
        System.out.println("Available balance on gift card : " + gf.balance);
        acc1.add(gf);
    }
    public static void topUp(int amount, Customer obj,String number)
    {

        if(obj.balance < amount)
        {
            System.out.println("Amount cannot be added because of insufficient balance");
        }
        else {

            boolean flag = false;

            for (int i = 0; i < acc1.size(); i++) {

                if(number.equals(acc1.get(i).number))
                {
                    flag = true;
                    acc1.get(i).balance += amount;
                    obj.balance -= amount;
                    transC.add("Amount debited   : " +  amount + " : gift card money transfer");
                    System.out.println("Amount added successfully");
                }
            }
            if(!flag) System.out.println("Card not found");
        }
    }
    public static void history()
    {
        for (String s : transC) {
            System.out.println(s);
        }
    }
    public static void block(Customer flag,String num)
    {
        for (int i = 0; i < acc1.size(); i++) {

            if(num.equals(acc1.get(i).number))
            {
                flag.balance += acc1.get(i).balance;
                transC.add("Amount credited  : " +  acc1.get(i).balance + " : gift card money transfer");
                acc1.remove(i);
                System.out.println("Card blocked successfully");
                break;
            }

        }
    }
}
