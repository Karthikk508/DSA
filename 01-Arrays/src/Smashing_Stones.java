import java.util.Arrays;
public class Smashing_Stones {
    public static void main(String[] args) {
        stones();

    }
    public static void stones()
    {
        int[] originalArray = {1, 2, 3, 4, 5};
        for (int i = 0; i < 5; i++) {
            originalArray = Arrays.copyOf(originalArray, originalArray.length - 1);
            System.out.println(Arrays.toString(originalArray));
        }


    }

}
