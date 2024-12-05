public class Dominant_index {
    public static void main(String[] args) {
        int[] nums = {3,6,1,0};
        int max=0,index=0;
        for(int i=0; i<nums.length; i++)
        {
            if(nums[i]>max){ index=i; max = nums[i];}
        }
        //System.out.println(max);
        boolean flag=false;
        for(int i=0; i<nums.length; i++)
        {
            if (nums[i]!=max && max >= (nums[i] * 2)) {
                flag = true;
            }
            else{
                flag=false;
            break;}
        }

        if(flag)
            System.out.println(index);
        else
            System.out.println(-1);
    }
}
