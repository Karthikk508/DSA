public class Contains_Duplicate {

    public static void main(String[] args) {

        int[] nums = {1,2,3,4,5,6,6};
        boolean ans = containsDuplicate(nums);
        System.out.println(ans);

    }
    public static boolean containsDuplicate(int[] nums) {
        for(int i=0; i<nums.length; i++) {
            int current = nums[i];
            int j = i-1;

            while(j>=0 && current<nums[j]) {
                nums[j+1] = nums[j];
                j--;
            }

            if(j>=0 && current==nums[j]) return true;

            nums[j+1] = current;
        }

        return false;
    }
}
