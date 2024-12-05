package Array;

public class Find_Moves {

    public static void main(String[] args) {

        int[] num = {3,2,1,2,1,7};
        System.out.println(find(num));


    }

    public static int find(int[] nums){

        int move = 0;
        for(int i = 0; i<nums.length; i++)
        {
            for(int j = 0; j<nums.length; j++)
            {
                if(nums[i] == nums[j] && i != j)
                {
                    nums[i]++;
                    move++;
                    j = -1;
                }
            }

        }
        return move;

    }
}
