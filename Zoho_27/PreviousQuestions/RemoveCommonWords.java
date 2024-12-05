package PreviousQuestions;

import java.util.HashMap;
import java.util.Map;

public class RemoveCommonWords {

    public static void remove(){


        String s1 = "I want to be an astronaut";
        String s2 = "All I want to be is happy";
        String s3 = "Astronaut are awesome but I want to be a chef";


        Map<String,Integer> map = new HashMap<>();

        String[] arr1 = s1.split(" ");

        for (int i = 0; i < arr1.length; i++) {
            if(map.containsKey(arr1[i])){
                map.put(arr1[i],map.get(arr1[i])+1);
            }
            else{
                map.put(arr1[i],0);
            }
        }
        System.out.println(map);

        String[] arr2 = s2.split(" ");

        for (int i = 0; i < arr2.length; i++) {
            if(map.containsKey(arr2[i])){
                map.put(arr2[i],map.get(arr2[i])+1);
            }
        }
        System.out.println(map);

        String[] arr3 = s3.split(" ");

        for (int i = 0; i < arr3.length; i++) {
            if(map.containsKey(arr3[i])){
                map.put(arr3[i],map.get(arr3[i])+1);
            }
        }
        System.out.println(map);

        String ans1 = "";

        for (int i = 0; i < arr1.length; i++) {
            if(map.get(arr1[i]) != 2){
                ans1 += arr1[i];
                ans1 += " ";
            }
        }
        System.out.println(ans1);

        ans1 = "";

        for (int i = 0; i < arr2.length; i++) {
            if(map.containsKey(arr2[i]) && map.get(arr2[i]) == 2){
               continue;
            }
            ans1 += arr2[i];
            ans1 += " ";
        }
        System.out.println(ans1);

        ans1 = "";

        for (int i = 0; i < arr3.length; i++) {
            if(map.containsKey(arr3[i]) && map.get(arr3[i]) == 2){
                continue;
            }
            ans1 += arr3[i];
            ans1 += " ";
        }
        System.out.println(ans1);

    }

    public static void main(String[] args) {
        remove();
    }
}
