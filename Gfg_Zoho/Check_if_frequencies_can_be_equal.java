public class Check_if_frequencies_can_be_equal {

    public static void main(String[] args) {

        System.out.println(sameFreq("aababb"));

    }
    public static boolean sameFreq(String s) {

        int[] freq = new int[26];

        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        if (check(freq)) {
            return true;
        }

        for (int i = 0; i < 26; i++) {
            if (freq[i] > 0) {
                freq[i]--;
                if (check(freq)) {
                    return true;
                }
                freq[i]++;
            }
        }

        return false;
    }

    private static boolean check(int[] freq) {
        int reference = -1;
        for (int f : freq) {
            if (f > 0) {
                if (reference == -1) {
                    reference = f;
                } else if (f != reference) {
                    return false;
                }
            }
        }
        return true;
    }

}
