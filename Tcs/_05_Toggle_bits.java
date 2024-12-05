public class _05_Toggle_bits {

    public static void main(String[] args) {

        int n = 10;

        int k = (1 << (int) Math.floor(Math.log(n)/Math.log(2)) + 1) - 1;

        System.out.println(k);

        System.out.println( n ^ k);

        System.out.println(10 ^ 7 + 1 << 4);

        System.out.println(Math.floor(3.354645114));

        System.out.println((int) Math.floor(Math.log(10)/Math.log(2)) + 1);
    }
}




