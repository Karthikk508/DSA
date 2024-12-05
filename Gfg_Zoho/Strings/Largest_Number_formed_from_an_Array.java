package Strings;

import java.util.*;

public class Largest_Number_formed_from_an_Array {
    public static void main(String[] args) {

        String[] arr = {"5","45","78","4","1"};
        System.out.println(printLargest(arr));


    }
    public static String printLargest(String[] arr) {

        Arrays.sort(arr,(a,b)->(b+a).compareTo(a+b));
        String ans = "";
        for(String s : arr) ans += s;
        return ans;
    }
}
