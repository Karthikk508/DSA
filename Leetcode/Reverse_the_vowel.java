public class Reverse_the_vowel {

    public static void main(String[] args) {

        String rev = "practice";
        System.out.println(modify(rev));
    }
    public static String modify (String s)
    {
        int n = s.length();
        char[] arr = s.toCharArray();

        int i = 0, j = n-1;

        while(i<=j)
        {
            if(!isvowel(arr[i])) { i++; continue;
            }
            if(!isvowel(arr[j])) { j--; continue;
            }
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        String str1 = String.copyValueOf(arr);

        return str1;

    }
    public static boolean isvowel(char c)
    {
        return (c == 'a' || c == 'A' || c == 'e' || c == 'E' || c == 'i' || c == 'I' || c == 'o' || c == 'O' || c == 'u'|| c == 'U');
    }
}
