public class Fibanocci_formula {

    public static void main(String[] args) {

        System.out.println(find(50));

    }
    public static long find (long n)
    {
        return (long) ((Math.pow((1+Math.sqrt(5))/2,n) - Math.pow((1-Math.sqrt(5))/2,n)) /Math.sqrt(5));
    }
}


//- Math.pow((1-Math.sqrt(5))/2,n))   // U can eliminate this term because of less dominating