import java.util.ArrayList;
import java.util.Scanner;

public class Multidimensional_ArrayLists {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        ArrayList<ArrayList<Integer>> twod = new ArrayList<>(10);

        for (int i = 0; i < 3; i++) {

            twod.add(new ArrayList<>(i));
        }

        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j < 3; j++) {

                twod.get(i).add(in.nextInt());
            }
        }

        System.out.println(twod);

    }
}
