package Set_1;
class RankThePermutations {

    public static void main(String[] args) {

        String s = "yash";

        System.out.println(find(s.toLowerCase()));

    }

    public static long find(String s)
    {
        int n = s.length();

        long[] fact = new long[n];

        fact[0] = 1;
        fact[1] = 1;

        for (int i = 2; i < n; i++) {
            fact[i] = fact[i-1] * i;
        }

        long res = 1;

        for (int i = 0; i < s.length(); i++) {
            int count = 0;
            for (int j = i+1; j < s.length(); j++) {
                if(s.charAt(i) > s.charAt(j))
                {
                    count++;
                }
            }
            res += (count * fact[n-i-1]);
        }
        return res;
    }



}


