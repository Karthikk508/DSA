public class Move_zeros {
    public static void main(String[] args) {

        class Solution {
            public void moveZeroes(int[] nums) {

                int i = nums.length-1;
                int j = i-1;

                while(i>=0)
                {
                    while(j>=0)
                    {
                        if(nums[j]==0){

                            int temp = nums[i];
                            nums[i]=nums[j];
                            nums[j]=temp;
                            j--;
                            break;
                        }
                        else j--;

                    }
                    i--;
                }

              //  return nums;

            }
        }
    }
}
