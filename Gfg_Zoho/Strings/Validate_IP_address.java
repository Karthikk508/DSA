package Strings;

import java.util.Arrays;

class Validate_IP_address  {


    public static void main(String[] args) {

        String s = "0.0.0.0";
        System.out.println(isValid(s));

        int num = Integer.parseInt("22");

        System.out.println(num);

    }

    public static boolean isValid(String s) {
        // Write your code here

        if(s.endsWith(".")){
            return false;
        }
        String[] arr = s.split("\\.");

        System.out.println(Arrays.toString(arr));

        if(arr.length!=4)
            return false;

        for(int i=0;i<arr.length;i++){
            //System.out.println(arr[i]);
            if(arr[i].length()>1 && arr[i].startsWith("0")){
                return false;
            }
            if(arr[i].isEmpty()){
                return false;
            }
            if(!arr[i].matches("\\d+"))
                return false;
            Integer num = Integer.valueOf(arr[i]);
            if(num<0 || num>255){
                return false;
            }
        }
        return true;
    }
}