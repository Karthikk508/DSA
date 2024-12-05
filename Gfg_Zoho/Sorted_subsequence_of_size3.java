import java.util.ArrayList;

public class Sorted_subsequence_of_size3 {

    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(-1);
        nums.add(1);
        nums.add(9);
        nums.add(2);
        nums.add(10);
        nums.add(3);
        System.out.println(nums);
        ArrayList<Integer> result = find3Numbers(nums, nums.size());
        System.out.println("Result: " + result);


    }
    public static ArrayList<Integer> find3Numbers(ArrayList<Integer> arr, int n) {
        // add code here.

        // Initialize max index with the last index of the array
        int max = n - 1;
        // Initialize min index with 0
        int min = 0;
        // Initialize a variable to iterate over the array
        int i = 0;

        // Create an array to store the index of the smallest element on the left side of each element
        int[] smaller = new int[n];
        smaller[0] = -1; // first entry will always be -1
        for (i = 1; i < n; i++) {
            // If the current element is smaller than or equal to the element at the min index
            if (arr.get(i) <= arr.get(min)) {
                // Update the min index to the current index
                min = i;
                // Store -1 in the smaller array to indicate that no smaller element is present on the left side
                smaller[i] = -1;
            } else {
                // Store the min index in the smaller array to indicate the smallest element on the left side
                smaller[i] = min;
            }
        }

        // Create an array to store the index of the greatest element on the right side of each element
        int[] greater = new int[n];
        greater[n - 1] = -1; // last entry will always be -1
        for (i = n - 2; i >= 0; i--) {
            // If the current element is greater than or equal to the element at the max index
            if (arr.get(i) >= arr.get(max)) {
                // Update the max index to the current index
                max = i;
                // Store -1 in the greater array to indicate that no greater element is present on the right side
                greater[i] = -1;
            } else {
                // Store the max index in the greater array to indicate the greatest element on the right side
                greater[i] = max;
            }
        }

        // Create a list to store the 3 numbers
        ArrayList<Integer> r = new ArrayList<Integer>();

        // Iterate over the array
        for (i = 0; i < n; i++) {
            // If there exists a smaller and a greater element for the current element
            if (smaller[i] != -1 && greater[i] != -1) {
                // Add the smaller, current, and greater element to the result list
                r.add(arr.get(smaller[i]));
                r.add(arr.get(i));
                r.add(arr.get(greater[i]));
                // Return the result list
                return r;
            }
        }

        // Return an empty list if no such 3 numbers exist
        return r;
    }
}

