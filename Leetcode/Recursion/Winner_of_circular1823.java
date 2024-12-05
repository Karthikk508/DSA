package Recursion;

import java.util.Arrays;


public  class Winner_of_circular1823 {

    public static void main(String[] args) {

        //System.out.println(findTheWinner(5,2));
        int n = 6 ,k = 2;
        int ans = 0;
        for(int i = 1; i<=n; i++)
        {
            ans = (ans+k) % i;
        }
        System.out.println(ans+1);
    }
   
    public static int findTheWinner(int n, int k) {
        return helper(n,k)+1;
    }
    public static int helper(int n,int k){
        if(n==1)
            return 0;
        return (helper(n-1,k) + k) % n;
    }
}





//public class Winner_of_circular1823 {




//    public static void main(String[] args) {
//
//        int[] arr = {1,2,3,4,5,6};
//        circular(arr,5);
//        int n = 2;
//         n = n % 2;
//        System.out.println(n);
//    }



//    public static void circular(int[] arr,int n)
//    {
//        int count = 0 , count1 = 0 , i = 0;
//        while(true)
//        {
//            ++count1;
//
//            if(count1 == n)
//            {
//                arr[i] = 0;
//                i = i + 1; if(i == arr.length-1) i = 0;
//                count1 = 0;
//                count++;
//            }
//
//            if(count == n)
//            {
//                break;
//            }
//            i++;
//            if(i == arr.length-1) i = 0;
//        }
//        System.out.println(Arrays.toString(arr));
//    }

