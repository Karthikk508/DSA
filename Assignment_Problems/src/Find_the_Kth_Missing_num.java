import java.lang.reflect.Array;
import java.util.Arrays;

public class Find_the_Kth_Missing_num {

    public static void main(String[] args) {

        int[] arr= {1,2,3,4};
        int k = 2;
        int start = 0;
        int j = arr.length;
        int end = arr[arr.length-1];
        int[] result = new int[end+k];
        int index = 0;

        for(int i=1; i<=end+k; i++)
        {
            if(start<j){
                if(arr[start] == i)
                {
                    start++;
                    continue;
                }
                else
                {
                    result[index]=i;
                    index++;
                }
            }
            else {
                result[index]=i;
                index++;
            }



        }

        System.out.println(Arrays.toString(result));
    }
}
