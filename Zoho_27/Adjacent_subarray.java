import java.util.ArrayList;
import java.util.List;

public class Adjacent_subarray {

    public static void main(String[] args) {

        int[] arr = {2,5,7,8,9,2,3,4,3,1};

        List<Integer> nums = new ArrayList<>();

        for(int i = 0; i<arr.length; i++)
        {
            nums.add(arr[i]);
        }

        System.out.println(hasIncreasingSubarrays(nums,3));
        

    }
    public static boolean hasIncreasingSubarrays(List<Integer> nums, int k) {

        boolean flag  =  true;
        boolean flag1 =  true;

        if(k == 1 && nums.size() == 2)
        {
            return true;
        }
        if(k == 1 && nums.size() == 3)
        {
            return true;
        }

        for(int i = 0; i<nums.size()-1; i++)
        {
            flag  =  true;
            flag1 =  true;

            int j;
            for(j = i; j<(i+k)-1 && j < nums.size()-1; j++)
            {
                if(nums.get(j) > nums.get(j+1))
                {
                    flag = false;
                }
            }
            if((j - i)+1 != k)
            {
                flag = false;
            }
            int l;
            for(l = (i+k); l<(i+(2*k))-1 && l < nums.size()-1; l++){

                if(nums.get(l) > nums.get(l+1))
                {
                    flag1 = false;
                }
            }
            if((l-(i+k))+1 != k)
            {
                flag1 = false;
            }
            if(flag && flag1)
            {
                return true;
            }
        }
        if(flag && flag1)
        {
            return true;
        }
        return false;
    }
}
