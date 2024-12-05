package SecondRound_2nd_pdfProblems;

public class Qn_6 {

    //Remove duplicates from string


    public static void main(String[] args) {

        String str = "JJklmnnoopppqqqrr12444455999";

        remove(str);

//        int[] arr = {0,1,2,3,4,5,6,7,8,9};
//        rotate(arr);
    }
    public static void remove(String str)
    {
        String ans = "";

        int[] map1 = new int[26];
        int[] map2 = new int[10];

        for(int i = 0; i<str.length(); i++)
        {
            if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
            {
                map1[str.charAt(i) - 'a']++;

                if(map1[str.charAt(i) - 'a'] > 1)
                {
                    for(int j = 0; j<map1.length; j++)
                    {
                        if(map1[j] == 0)
                        {
                            ans += (char) (j+97);
                            map1[j]++;
                            break;
                        }
                    }
                }
                else {
                    ans += str.charAt(i);
                }
            }
            else if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')
            {

                map1[str.charAt(i) - 'A']++;

                if(map1[str.charAt(i) - 'A'] > 1)
                {
                    for(int j = 0; j<map1.length; j++)
                    {
                        if(map1[j] == 0)
                        {
                            ans += (char) (j+65);
                            map1[j]++;
                            break;
                        }
                    }
                }
                else {
                    ans += str.charAt(i);
                }

            }
            else {

                map2[str.charAt(i) - '0']++;

                if(map2[str.charAt(i) - '0'] > 1)
                {
                    int start = str.charAt(i) - '0' , k = 0 , n = map2.length;

                    while(k < 10)
                    {
                        start = start % n;
                        if(map2[start] == 0)
                        {
                            ans += (char) (start + '0');
                            map2[start]++;
                            break;
                        }
                        start++;
                        k++;
                    }
                }
                else {
                    ans += str.charAt(i);
                }


            }
        }
        System.out.println(ans);
    }


    public static void rotate(int[] arr)
    {
        int start = 5 , k = 0 , n = arr.length;

        while(k < 10)
        {
            start = start % n;
            System.out.println(arr[start]);
            start++;
            k++;
        }
    }
}
