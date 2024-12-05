package Strings;
class Reverse_each_word_inString
{

    public static void main(String[] args) {

        String s = "i.like.programming";


        System.out.println( reverseWords(s));
    }

    static void reverse(char[] arr, int start, int end)
    {
        while(start < end && start >=0 && end <= arr.length)
        {
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    static String reverseWords(String s)
    {
        // your code here

        char[] arr = s.toCharArray();

        int start = 0 , end = 0;

        for(int i = 0; i<s.length(); i++)
        {
            if(s.charAt(i) == '.')
            {
                end = i - 1;
                reverse(arr,start,end);
                start = i + 1;
            }
            if(i == s.length()-1)
            {
                end = i;
                reverse(arr,start,end);
            }
        }


        return new String(arr);
    }
}