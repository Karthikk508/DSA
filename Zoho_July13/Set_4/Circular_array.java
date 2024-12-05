package Set_4;

public class Circular_array {

    public static void main(String[] args) {

        String[] words = {"hello","i","am","leetcode","hello"};

        String target = "hello";

        System.out.println(find(words,target,1));


    }
    public static int find(String[] words, String target, int startIndex )
    {
        int n = words.length;
        int i = (startIndex % (n-1))+1;
        int ans = Integer.MAX_VALUE;
        int count = 0;

        while(i != startIndex)
        {
            if(target.equals(words[i]))
            {
                int min = Math.abs(i - startIndex);
                ans = Math.min(ans,min);
            }
            if(count == words.length+1)
            {
                return -1;
            }

            if(i == n-1)
            {
                i = 0;
            }
            else {
                i++;
            }

            count++;
        }

        return ans;
    }
}
