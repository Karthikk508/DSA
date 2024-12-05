package OOPS.Pillars.Abstraction.Udemy.Challenge;

public class LeatherBall extends ProductForSale{


    public LeatherBall(String type, double price, String description) {
        super(type, price, description);
    }

    @Override
    public void showDetails() {
        System.out.println("Leather ball");
        System.out.println(type);
        System.out.println(price);
        System.out.println(description);
    }
}
