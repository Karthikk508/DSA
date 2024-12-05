import java.util.Arrays;

public class  Remove_duplicates80{
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6};

        System.out.println(removeDuplicates(arr));

        System.out.println(Arrays.toString(arr));
    }
    public static int removeDuplicates(int[] nums) {

        int i = 0;
        for (int n : nums)
            if (i < 2 || n > nums[i-2])
                nums[i++] = n;

        return i;
    }
}

//        if(nums.length == 1) return nums[0];
//        int count = 1;
//        int index = 0 , i1 = 0;
//        for(int i = 0; i<nums.length-1; i++)
//        {
//        if(nums[i] != nums[i+1])
//        {
//        if(count<=2)
//        {
//        nums[index++] = nums[i];
//        i1++;
//        }
//        count = 1;
//        }
//        if(nums[i] == nums[i+1] && count <= 2)
//        {
//nums[index++] = nums[i];
//count++;
//i1++;
//        }
//        }
//        System.out.println(count);
//        if(nums[nums.length-1] != nums[index] && count <= 2)
//        {
//nums[index] = nums[nums.length-1];
//i1++;
//        }
//        if(count <= 2 && i1<=2) i1++;
//        return i1;