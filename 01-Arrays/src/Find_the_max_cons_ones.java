public class Find_the_max_cons_ones {

       public static void main(String[] args) {
           int[] arr = {1,1,1,1,1,1,1,1,0};
           int ans = consecutiveOnes(arr.length,arr);
           System.out.println(ans);
        }

        public static int consecutiveOnes(int n, int[] arr) {
            // Write your code here.
            int max = 0;
            int count = 0;
            for(int i=0; i<n; i++)
            {
                if(arr[i]==1)
                {
                    count++;
                    if(count>max) max = count;
                }
                else{
                    count = 0;
                }
            }

            return max;
        }

}
