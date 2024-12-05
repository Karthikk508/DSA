import java.util.ArrayList;
import java.util.Objects;

public class Array_Lists {

    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>(10);

        for (int i = 0; i <10 ; i++) {

            arr.add(i);
        }

        int j= arr.get(1);

        System.out.println(j);

        System.out.println(arr);

    }
    public static int removeDuplicates(ArrayList<Integer> arr,int n) {
        // Write your code here.
        int count = 0;
        for(int i=0; i<n-1; i++)
        {
            if(!Objects.equals(arr.get(i), arr.get(i + 1)))
            {
                count++;
            }
        }
        return count+1;

    }
}
