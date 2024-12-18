public class Max_odd_binary {

    public static void main(String[] args) {

        String ans = maximumOddBinaryNumber("10011001");
        System.out.println(ans);
    }
    public static String maximumOddBinaryNumber(String s) {
        int cnt1 = 0, cnt0 = 0;
        for (char a : s.toCharArray()) {
            if (a == '1') cnt1++;
            else if (a == '0') cnt0++;
        }
        StringBuilder ans = new StringBuilder();
        ans.append("1".repeat(cnt1 - 1));
        ans.append("0".repeat(cnt0));
        ans.append("1");
        return ans.toString();
    }
}



