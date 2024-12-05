package Set_7;


import javax.management.MBeanRegistration;
import javax.management.MBeanRegistrationException;
import java.util.Arrays;

class Solution {

    public static void main(String[] args) {


        int n = 4 , m = 5;

        long[] arr1 = {1,3,5,7};
        long[] arr2 = {0,2,6,8,9};


        merge(n,m,arr1,arr2);

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));



    }

   public static void merge(int n, int m, long[] arr1, long[] arr2) {

       // code here

       int len = (n+m);

       int gap = (len/2) + (len%2);

       while(gap > 0)
       {
          int left = 0;
          int right = gap + left;

          while(right < len)
          {
              if(left < n && right >= n)
              {
                  swap(left,right-n,arr1,arr2);
              }
              else if(left >= n)
              {
                  swap(left-n,right-n,arr2,arr2);
              }
              else {
                  swap(left,right,arr1,arr1);
              }
              left++;
              right++;
          }
          if(gap == 1) break;
          gap = (gap/2) + (gap%2);
       }
   }
   public static void swap(int i,int j,long[] arr1,long[] arr2)
   {
       if(arr1[i] > arr2[j]) {
           long temp = arr1[i];
           arr1[i] = arr2[j];
           arr2[j] = temp;
       }
   }

}

