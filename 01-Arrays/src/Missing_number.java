public class Missing_number {

    public static void main(String[] args) {
        int[] arr = {0,1,2,3,5,6,7};
        int ans =  missingNumber(arr);
        System.out.println(ans);
    }

    public static int missingNumber(int[] nums) {
        int N = nums.length;
        int xor1=0,xor2=0;
        for(int i=0; i<nums.length; i++)
        {
            xor1 = xor1 ^ i;
            xor2 = xor2 ^ nums[i];
        }
        xor1 = xor1 ^ N;
        return xor1 ^ xor2;
    }




// sum of first n natural numbers n = n(n+1)/2
// class Solution {
//     public int missingNumber(int[] nums) {
//         int n=nums.length;
//         int sum=0,sum1=0;
//         for(int i=0;i<n;i++)
//             sum+=nums[i];
//         for(int i=0;i<=n;i++)
//             sum1+=i;
//         return sum1-sum;
//     }
// }

// Binary search approach
// class Solution {
//     public int missingNumber(int[] nums) {

//         int i = 0;
//         while(i<nums.length)
//         {
//            int correct = nums[i];
//            if(correct >= nums.length) i++;
//            else if(nums[i] != nums[correct])
//            {
//                swap(nums,i,correct);
//            }
//            else i++;
//         }

//         for(int j=0; j<nums.length; j++)
//         {
//             if(nums[j] != j)
//             return j;
//         }


//         return nums.length;


//     }
//     public void swap(int[] arr, int first, int second) {
//             int temp = arr[first];
//             arr[first] = arr[second];
//             arr[second] = temp;
//         }
// }

// class Solution {
//     public int missingNumber(int[] arr) {
//         int i = 0;
//         while (i < arr.length) {
//             int correct = arr[i];
//             if (arr[i] < arr.length && arr[i] != arr[correct]) {
//                 swap(arr, i , correct);
//             } else {
//                 i++;
//             }
//         }

//         // search for first missing number
//         for (int index = 0; index < arr.length; index++) {
//             if (arr[index] != index) {
//                 return index;
//             }
//         }

//         // case 2
//         return arr.length;
//     }

//     void swap(int[] arr, int first, int second) {
//         int temp = arr[first];
//         arr[first] = arr[second];
//         arr[second] = temp;
//     }
// }
}
