package OOPS.Pillars.Abstraction.Udemy.Challenge;


import java.util.ArrayList;


record OrderItem(int qty,ProductForSale product){}

public class Store {

    private static ArrayList<ProductForSale> storeProducts = new ArrayList<>();

    public static void main(String[] args) {


        ProductForSale bat = new CricketBat("SH",3500,"English willow");

        //bat.showDetails();
        bat.getSalesPrice(5);

        ProductForSale ball = new LeatherBall("Red",10000,"SG");

        //ball.showDetails();
        ball.getSalesPrice(5);
        ball.printPriceItem(10);

        storeProducts.add(new LeatherBall("white",2000,"Kookaboora"));
        storeProducts.add(new CricketBat("Long",15000,"mrf"));

        listProducts();

        System.out.println("-".repeat(30));

        System.out.println("Order 1");
        var order1 = new ArrayList<OrderItem>();
        addItemToOrder(order1,0,5);
        addItemToOrder(order1,1,2);
        printOrder(order1);

        System.out.println("-".repeat(30));

        System.out.println("Order 2");
        var order2 = new ArrayList<OrderItem>();
        addItemToOrder(order2,0,5);
        addItemToOrder(order2,1,2);
        printOrder(order2);


    }
    public static void listProducts()
    {
        for(var item : storeProducts)
        {
            System.out.println("-".repeat(30));
            item.showDetails();
        }

    }
    public static void addItemToOrder(ArrayList<OrderItem> order,int orderIndex,int qty)
    {
        order.add(new OrderItem(qty,storeProducts.get(orderIndex)));
    }
    public static void printOrder(ArrayList<OrderItem> order)
    {
        double salesTotal = 0;

        for(var item : order)
        {
            item.product().printPriceItem(item.qty());
            salesTotal += item.product().getSalesPrice(item.qty());
        }
        System.out.printf("Sales total = $%6.2f %n",salesTotal);
    }
}
