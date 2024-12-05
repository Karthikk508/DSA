package String;

import java.util.ArrayList;
import java.util.Arrays;

public class Largest_odd_num {

    public static void main(String[] args) {

        int[] arr = new int[1];

        subset(arr,0,"","752");
        

        System.out.println(Arrays.toString(arr));


    }
    public static void subset(int[] arr,int ind,String p,String up)
    {

        if(up.isEmpty())
        {
            if(!p.isEmpty()) {
                int val = Integer.parseInt(p);

                if (val % 2 != 0) {
                    if (val > arr[0]) {
                        arr[0] = val;
                    }
                }
            }
            return;
        }

        char ch = up.charAt(0);

        subset(arr,ind+1,p+ch,up.substring(1));
        subset(arr,ind+1,p,up.substring(1));

    }
}
