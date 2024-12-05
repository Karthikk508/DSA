import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {


        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();

        ArrayList<Integer> arr1 = new ArrayList<>();
        arr1.add(1);
        arr1.add(2);
        arr1.add(3);
        arr1.add(4);

        arr.add(arr1);

        for(Integer it : arr.get(0))
        {
            System.out.println(it);
        }



    }
}