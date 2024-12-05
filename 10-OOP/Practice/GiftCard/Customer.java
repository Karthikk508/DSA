package Practice.GiftCard;

public class Customer {

    static int id = 1;
    int cusId;
    String email;
    String password;
    int balance;

    //Gift card

    static int id1 = 1;
    int gId;
    String number ;
    int G_balance;

    Customer(String email,String password,int balance)
    {

        this.cusId = id++;
        this.email = email;
        this.password = Password.encrypt(password);
        this.balance = balance;
    }
    //Gift card
    Customer(String number)
    {
        this.gId = id1++;
        this.number = number + gId;
    }

}
