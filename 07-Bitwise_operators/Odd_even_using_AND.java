public class Odd_even_using_AND {
    public static void main(String[] args) {
        System.out.println(isOdd(17));
    }
    public static boolean isOdd(int n)
    {
        return (n & 1) == 1;
    }

}
