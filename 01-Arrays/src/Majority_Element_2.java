import java.util.*;
public class Majority_Element_2 {

    public static void main(String[] args) {
        int[] arr = {11, 33, 33, 11, 33, 11};
        List<Integer> ans = majorityElement(arr);
        System.out.print("The majority elements are: ");
        for (Integer an : ans) {
            System.out.print(an + " ");
        }
        System.out.println();
    }
    public static List<Integer> majorityElement(int[] nums) {

        int el1 = Integer.MIN_VALUE, el2 = Integer.MIN_VALUE, cnt1 = 0, cnt2 = 0;

        for(int i = 0; i<nums.length; i++)
        {
            if(cnt1 == 0 && el2 != nums[i])
            {
                cnt1 = 1;
                el1 = nums[i];
            }
            else if(cnt2 == 0 && el1 != nums[i])
            {
                cnt2 = 1;
                el2 = nums[i];
            }
            else if(el1 == nums[i]) cnt1++;
            else if(el2 == nums[i]) cnt2++;
            else
            {
                cnt1--;
                cnt2--;
            }

        }
        cnt1 = 0;
        cnt2 = 0;
        for (int num : nums) {
            if (el1 == num) cnt1++;
            if (el2 == num) cnt2++;
        }

        List<Integer> res = new ArrayList<>();
        int min = (nums.length/3);
        System.out.println(min);

        if(cnt1 > min) res.add(el1);
        if(cnt2 > min) res.add(el2);

        return res;
    }
}
