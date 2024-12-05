package Arrays;
import java.util.*;

public class Max_interval_overlap {
    static class GuestResult {
        int maxGuests;
        int maxGuestsTime;

        public GuestResult(int maxGuests, int maxGuestsTime) {
            this.maxGuests = maxGuests;
            this.maxGuestsTime = maxGuestsTime;
        }
    }

    static GuestResult findMaxGuests(int[] arr, int[] dep, int n) {
        Arrays.sort(arr);
        Arrays.sort(dep);

        int i = 1;
        int j = 0;
        int res = 1;
        int curr = 1;

        int minTime = arr[0];

        while (i < n && j < n) {
            if (arr[i] <= dep[j]) {
                curr++;
                i++;
            } else {
                curr--;
                j++;
            }
            if (curr > res) {
                res = curr;
                minTime = arr[i - 1];
            }
        }

        return new GuestResult(res, minTime);
    }

    public static void main(String[] args) {
        int[] arrival = {1, 2, 10, 5, 5};
        int[] departure = {4, 5, 12, 9, 12};
        int n = arrival.length;

        GuestResult result = findMaxGuests(arrival, departure, n);
        System.out.println("Maximum Number of Guests: " + result.maxGuests);
        System.out.println("Guests Present at Max Time: " + result.maxGuestsTime);
    }
}
