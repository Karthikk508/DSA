public class No_of_binary_digits {
    public static void main(String[] args) {
        int n = 123456;
        int b = 10;
        int digits = (int) (Math.log(n)/Math.log(b)) + 1;
        System.out.println(digits);
    }

}
