public class Find_pivot_element {
    public static void main(String[] args) {
        int[] nums = {1,7,3,6,5,6};
        int start=0;
        int end=nums.length-1;
        int mid = start + (end-start)/2;
        while(mid>start && mid<=end)
        {
            int left=0;
            int right=0;
            for(int i=0;i<mid; i++) left+=nums[i];
            for(int j=end;j>mid;j--) right+=nums[j];

            if(left<right)
            {
                mid++;
            }
            else if(left>right)
            {
                mid--;
            }
            if(left==right)
            {
                System.out.println(mid);
                break;
            }

        }
        System.out.println(mid);
    }
}

