public class Xor_Find_non_repeating {

        public static void main(String[] args) {
            int[] arr = {1,1,2,2,3,3,4,5,5,6,6};
            int ans = getSingleElement(arr);
            System.out.println(ans);
        }

        public static int getSingleElement(int []arr){
            // Write your code here.
            int xor1 = 0;
            for (int j : arr) {
                xor1 = xor1 ^ j;
            }
            return xor1;
        }

}
