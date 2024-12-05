package SecondRound_2nd_pdfProblems;

public class Qn_27 {

    public static void main(String[] args) {



    }
    public static String reverse(String str)
    {
        int start = 0 , end = str.length()-1;
        char[] arr = str.toCharArray();

        while(start < end){

            while(start < end && !((arr[start] >= 'A' && arr[start] <= 'Z') || (arr[start] >= 'a' && arr[start] <= 'z'))) start++;
            while(end > start && !((arr[end] >= 'A' && arr[end] <= 'Z') || (arr[end] >= 'a' && arr[end] <= 'z'))) end--;

            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;

        }
        return new String(arr);
    }
}
