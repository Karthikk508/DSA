package EasyLeetcode;


class  ReverseWord3 {

    public static void main(String[] args) {

        String s = "Let's take LeetCode contest";
        System.out.println(reverseWords(s));
    }
    public static String reverseWords(String s) {

        char[] arr = s.toCharArray();
        return  reverse(arr);
    }
    public static String reverse(char[] arr)
    {

        int start = 0;
        for(int i = 0; i<arr.length; i++)
        {
            if(arr[i] == ' ')
            {
                reverse1(start,i-1,arr);
                start = i+1;
            }
            if(i == arr.length-1)
            {
                reverse1(start,i,arr);
            }
        }

        return new String(arr);
    }
    public static void reverse1(int i,int j,char[] arr)
    {
        while(i < j)
        {
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}