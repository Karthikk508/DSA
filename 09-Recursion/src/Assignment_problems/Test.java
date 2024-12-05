package Assignment_problems;

import java.util.Arrays;
import java.util.*;

public class Test {

    public static void main(String[] args) {

        char[] arr = {'[','(',')',']'};

        char[] a = new char[7];

        a = Arrays.copyOfRange(arr,1,3);

        System.out.println(Arrays.toString(a));

        int[] arr1 = {1,2,3,4,5,6};

        int[]  a1 = new int[8];

        a1 = Arrays.copyOfRange(arr1,1,3);

        System.out.println(Arrays.toString(a1));



    }


}
