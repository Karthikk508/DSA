package String.Medium;

public class SortByFreq {

    public static void main(String[] args) {

        String a = "tree";
        System.out.println(frequencySort(a));

    }
    public static String frequencySort(String s) {
        char[] str = s.toCharArray();
        int[] freq = new int[123];

        for(int i = 0; i < str.length; i++) {
            freq[str[i]]++;
        }

        for(int i = 0; i < str.length;) {
            char max = '.';
            for(int j = 0; j < 123; j++) {
                if(freq[j] > freq[max]){
                    max = (char)j;
                }
            }

            while(freq[max] != 0) {
                str[i++] = max;
                freq[max]--;
            }
        }
        return new String(str);
    }
}

