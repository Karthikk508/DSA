package OOPS.Pillars.Abstraction.Udemy.Challenge;

public class CricketBat extends ProductForSale{


    public CricketBat(String type, double price, String description) {
        super(type, price, description);
    }

    @Override
    public void showDetails() {
        System.out.println("Invoice");;
        System.out.println(type);
        System.out.println(price);
        System.out.println(description);

    }
}
