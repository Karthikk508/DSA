package Hard_Imp;
import java.util.*;


public class Top_k_El_BucketSort {
    public static List<Integer> topKFrequent(int[] nums, int k) {
        // Count the frequency of each number
        Map<Integer, Integer> count = new HashMap<>();
        for (int n : nums) {
            count.put(n, count.getOrDefault(n, 0) + 1);
        }

        // Create a list of lists to store numbers by their frequency
        List<Integer>[] freq = new List[nums.length + 1];
        for (int i = 0; i < freq.length; i++) {
            freq[i] = new ArrayList<>();
        }

        // Fill the frequency lists
        for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
            int number = entry.getKey();
            int frequency = entry.getValue();
            freq[frequency].add(number);
        }

        // Collect the top k frequent numbers
        List<Integer> res = new ArrayList<>();
        for (int i = freq.length - 1; i > 0 && res.size() < k; i--) {
            for (int n : freq[i]) {
                res.add(n);
                if (res.size() == k) {
                    return res;
                }
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2, 3};
        int k = 2;
        List<Integer> result = topKFrequent(nums, k);
        System.out.println(result); // Output: [1, 2]
    }
}
