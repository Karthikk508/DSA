
package VariableLengthArguments;

import java.util.Arrays;

public class Var_arg {

    public static void main(String[] args) {


        var(1,2,3,4,5,6,7,8,9,10);

        int x = 0;

        System.out.println(x);

    }
    public static void var(int ...arr){


        System.out.println(arr[0]);

        System.out.println(Arrays.toString(arr));
    }
}
