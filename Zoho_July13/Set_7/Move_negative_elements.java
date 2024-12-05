package Set_7;


public class Move_negative_elements {


    public static void moveNegativesToEnd(int[] arr) {
        int n = arr.length;
        int pos = 0;

        System.out.println(Math.log10(10));


        // First, move all non-negative elements to the front
        for (int i = 0; i < n; i++) {
            if (arr[i] >= 0) {
                arr[pos] = arr[i];
                pos++;
            }
        }

        // Now, fill the rest with negative elements
        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                arr[pos] = arr[i];
                pos++;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,-1,3,2,-7,-5,11,6};
        moveNegativesToEnd(arr);

        // Print the modified array
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
//    public static void rearrange(int[] arr) {
//        int n = arr.length;
//        int i = 0; // Pointer for iterating through the array
//
//        // Traverse the array and rearrange elements
//        for (int j = 0; j < n; j++) {
//            if (arr[j] >= 0) {
//                // Swap non-negative element with arr[i] and increment i
//                int temp = arr[i];
//                arr[i] = arr[j];
//                arr[j] = temp;
//                i++;
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//        int[] arr = {1, -1, 3, -2, -3, 4, 5};
//        rearrange(arr);
//        // Print the rearranged array
//        for (int num : arr) {
//            System.out.print(num + " ");
//        }
//    }
}

