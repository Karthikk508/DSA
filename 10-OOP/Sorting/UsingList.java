package Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Frequency {
    String num;
    String count;

    Frequency(int num, int count) {
        this.num = String.valueOf(num);
        this.count = String.valueOf(count);
    }

    @Override
    public String toString() {
        return num + " (" + count + ")";
    }
}


public class UsingList {


    public static void main(String[] args) {


        int[] arr = {5,5,5,5,5,1,1,2,3,6,6,6,8,8,1};

        Arrays.sort(arr);

        List<Frequency> list = new ArrayList<>();

        int count = 1;

        for (int i = 0; i < arr.length-1; i++) {

            if(arr[i] != arr[i+1]){
                list.add(new Frequency(arr[i],count));
                count = 1;
            }
            else {
                count++;
            }
        }
        list.add(new Frequency(arr[arr.length-1],count));

        System.out.println(list);

        list.sort((obj1,obj2) -> (obj2.count).compareTo(obj1.count));

        System.out.println(list);

    }
}
