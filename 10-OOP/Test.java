import java.util.*;
import java.util.concurrent.TransferQueue;



record test2(String name,int age,String place)
{

}

public class Test {
    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        System.out.println(arr);

        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        list.remove(2);

        System.out.println(list);

        test2 t = new test2("karthikeyan",22,"Salem");

        System.out.println(t.name());
        System.out.println(t.age());
        System.out.println(t.place());


        
        String str = " ";

        System.out.println(str.isBlank());


    }
}


