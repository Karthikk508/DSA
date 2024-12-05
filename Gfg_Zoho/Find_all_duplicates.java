import java.util.ArrayList;


class Find_all_duplicates {
    public static ArrayList<Integer> duplicates(int arr[], int n) {

        // First check all the values that are
        // present in an array then go to that
        // values as indexes and increment by
        // the size of array
        for (int i = 0; i < n; i++) {
            int index = arr[i] % n;
            arr[index] += n;
        }

        // Now check which value exists more
        // than once by dividing with the size
        // of array
        int flag = 0;
        ArrayList<Integer> ans = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            if ((arr[i] / n) > 1) {
                ans.add(i);
                flag = 1;
            }
        }
        if (flag == 0) ans.add(-1);
        return ans;
    }
    public static void main(String[] args) {

        int[] arr = {1,2,3,1,3,6,6};

        System.out.println(duplicates(arr,7));
    }

}




// using cyclic sort

//public class  Find_all_duplicates{
//
//    public static void main(String[] args) {
//
//        int[] arr = {3,4 ,12 ,3, 12, 3 ,4 ,4 ,12, 7 ,11 ,6 ,5};
//
//        System.out.println(duplicates(arr,5));
//
//
//    }
//    public static ArrayList<Integer> duplicates(int nums[], int n) {
//        // code here  //Cyclic sort
//        ArrayList<Integer> ans = new ArrayList<>();
//
//        int i = 0;
//        while(i<nums.length)
//        {
//            int correct = nums[i];
//
//            if(nums[i] != nums[correct])
//            {
//                swap(nums,i,correct);
//            }
//            else
//            {
//                i++;
//            }
//        }
//        int k = 0;
//        for(int j = 0; j<nums.length; j++)
//        {
//            if(j != nums[j])
//            {
//               ans.add(nums[j]);
//            }
//        }
//
//        if(ans.isEmpty())
//        {
//            ans.add(-1);
//            return ans;
//        }
//        return ans;
//
//    }
//    public static void swap(int[] arr,int i, int j)
//    {
//        int temp = arr[i];
//        arr[i] = arr[j];
//        arr[j] = temp;
//    }
//}