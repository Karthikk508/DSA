package Strings;

import java.util.ArrayList;
import java.util.Objects;

public class leetcode_Dice_throw {

    public static void main(String[] args) {
        dice("",4);
        System.out.println(dice_list("",4));
    }
    public static void dice(String p , int target)
    {
        if(target == 0)
        {
            System.out.println(p);
            return;
        }
        for (int i = 1; i <= 6 && i <= target; i++) {
            dice(p+i,target-i);
        }
    }
    public static ArrayList<String> dice_list(String p , int target)
    {
        if(target == 0)
        {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        for (int i = 1; i<=6 && i <= target; i++) {
            ans.addAll(dice_list(p+i,target-i));
        }
        return ans;
    }
}
