public class Count_and_print_element_more_than_2 {

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        print(arr1);
    }
    public static void print(int[] arr) {
        int element = arr[0];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {

            if (element == arr[i]) {
                count++;
            } else {
                if (count > 1) {
                    System.out.println(arr[i - 1] + "->" + count);
                }
                count = 1;
                element = arr[i];
            }
        }
        if (count > 1) {
            System.out.println(arr[arr.length - 1] + "->" + count);
        }

    }

}
