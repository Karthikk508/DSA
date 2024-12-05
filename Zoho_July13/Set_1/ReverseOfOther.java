package Set_1;

public class ReverseOfOther {

    public static void main(String[] args) {
        String str1 = "9345273383";
        String str2 = "3833452739";

        System.out.println(find(str1, str2));
    }

    private static boolean find(String str1, String str2) {

//        int[] arr = new int[26];
//
//        for (int i = 0; i < str1.length(); i++) {
//            arr[str1.charAt(i) - '0']++;
//        }
//        for (int i = 0; i < str2.length(); i++) {
//            if(arr[str1.charAt(i) - '0'] == 0)
//            {
//                return false;
//            }
//        }

        int i = 0 , j = str2.length()-1 , ind = 0 ,start = Integer.MAX_VALUE;

        while (i < str1.length() && j >= 0)
        {
            if(str1.charAt(i) != str2.charAt(j))
            {
                start = Math.min(start,i);
                ind = i;
                while(str1.charAt(i) != str2.charAt(j))
                {
                    ind++;
                    i++;
                    j--;
                }
            }
            i++;
            j--;
        }

        System.out.println(str1.substring(start,ind));

        return true;
    }
}
