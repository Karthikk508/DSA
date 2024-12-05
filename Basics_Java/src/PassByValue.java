public class PassByValue {
    public static void main(String[] args) {

       String name = "Karthi";

       stringex(name);

       System.out.println(name);

    }
    static void stringex(String naam){

        System.out.println(naam);

        naam = "karthik";

        System.out.println(naam);

    }

}
