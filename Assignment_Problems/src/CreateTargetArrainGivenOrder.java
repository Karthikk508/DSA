import java.util.Arrays;

public class CreateTargetArrainGivenOrder {
    public static void main(String[] args) {


        int[] nums = {1, 2, 3, 4, 0};
        int[] index = {0, 1, 2, 3, 0};

        int[] ans = new int[nums.length];
        Arrays.fill(ans, -1);

        for (int i = 0; i < index.length; i++) {
            if (ans[index[i]] == -1) {
                ans[i] = nums[index[i]];
            } else {
                int temp = ans[index[i]];
                ans[index[i]] = nums[i];
                if (ans[index[i] + 1] == -1) {
                    ans[index[i] + 1] = temp;
                } else {
                    int start = index[i] + 1;
                    int end = ans.length - 1;
                    while (start <= end) {
                        int temp1 = ans[start];
                        ans[start] = temp;
                        temp = temp1;
                        start++;
                    }
                }


            }
        }
        System.out.println(Arrays.toString(ans));

        int[] answer = Another_easy_soln(nums,index);

        System.out.println(Arrays.toString(answer));


    }

    public static int[] Another_easy_soln(int[] nums, int[] index) {

        int[] target = new int[nums.length];

        //for shifting the elements

        for (int i = 0; i < nums.length; i++) {
            for (int j = nums.length - 1; j > index[i]; j--) {
                target[j] = target[j - 1];
            }
            target[index[i]] = nums[i];


        }
        return target;
    }
}





