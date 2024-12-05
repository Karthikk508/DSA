public class Bitwise_AND_of_Numbers_Range {

    public static void main(String[] args) {

        int cnt = 0;
        int left = 1 , right = 10;

        while (left != right) {
            left >>= 1;
            right >>= 1;
            cnt++;
        }
        System.out.println(left << cnt);
    }
}
