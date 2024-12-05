package PreviousQuestions;

import java.util.*;

public class GroupAnagrams {


    public static void main(String[] args) {

        List<String> words = Arrays.asList("eat", "tea", "tan", "ate", "nat", "bat");

        group(words);


    }
    public static void group(List<String> list){


        HashMap<String,List<String>> map = new HashMap<>();


        for (int i = 0; i < list.size(); i++) {

            char[] arr = list.get(i).toCharArray();
            Arrays.sort(arr);
            String temp = new String(arr);

            if(map.containsKey(temp)){
                map.get(temp).add(list.get(i));
            }
            else {
                List<String> list1 = new ArrayList<>();
                list1.add(list.get(i));
                map.put(temp,list1);
            }
        }

        System.out.println(map);


//        int[] arr = {1,2,3,4,5,6,7,8,9};
//
//        for(int s : arr){
//            System.out.println(s);
//        }

        List<List<String>> ans = new ArrayList<>();


        for(Map.Entry<String,List<String>> entry : map.entrySet()){
            List<String> temp = new ArrayList<>();
            for(int i = 0; i<entry.getValue().size(); i++){
                temp.add(entry.getValue().get(i));
            }
            ans.add(temp);
        }

        ans.sort(Comparator.comparing(List::size));
        System.out.println(ans);

    }
}
