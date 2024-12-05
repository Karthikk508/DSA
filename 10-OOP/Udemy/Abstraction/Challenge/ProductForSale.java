package OOPS.Pillars.Abstraction.Udemy.Challenge;

public abstract class ProductForSale {

    String type;
    double price;
    String description;

    public ProductForSale(String type, double price, String description) {
        this.type = type;
        this.price = price;
        this.description = description;
    }

    public abstract void showDetails();


    public double getSalesPrice(int quantity)
    {
        return quantity*price;
    }
    public void printPriceItem(int qty)
    {
        System.out.printf("%2d qty at $%8.2f each, %-15s %-35s %n", qty, price, type, description);

        //        System.out.println("%2d qyt at $%8.2f each , %-15s %-35s %n",qty,price,type,description);
        //        System.out.println("Quantity" + "                  " + "Description" + "                  " + "Unit price" + "                  " + "Amount");
        //        System.out.println(quantity + "                         " + description + "               " + price + "                      " + getSalesPrice(quantity));
    }
}
