package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class DiceThrow {

    public static void main(String[] args) {
        System.out.println(dice(4,""));
    }
    public static List<String> dice(int target, String p)
    {
        if(target == 0)
        {
            List<String> arr = new ArrayList<>();
            arr.add(p);
            return arr;
        }
        List<String> list = new ArrayList<>();

        for (int i = 1; i <= 6 && i<=target; i++) {
            list.addAll(dice(target-i,p+i));
        }
        return list;
    }

}
