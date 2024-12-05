package Set_1;
import java.io.*;
import java.util.Arrays;

class SpecialArrayReversal {
    public static void reverse(char str[])
    {

        int s = 0 , e = str.length-1;
        
        while(s < e)
        {
            if(!(str[s] >= 'a' && str[s] <= 'z' || str[s] >= '0' && str[s] <= '9' || str[s] >= 'A' && str[s] <= 'Z'))
            {
                s++;
            }
            else if(!(str[e] >= 'a' && str[e] <= 'z' || str[e] >= '0' && str[e] <= '9' || str[e] >= 'A' && str[e] <= 'Z' ))
            {
                e--;
            }
            else {

                swap(str,s,e);
                s++;
                e--;
            }
        }

    }

    public static void swap(char[] arr, int first, int second)
    {
        char temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    // Driver Code
    public static void main(String[] args)
    {
        String str = "house ! no : 12";

        //Input : "I brought 3 items : a pen, a notebook, and a scale.";
        //Output : "e lacsadn a koobe tona, nepasmeti,3th g uorbl";

        //Input : "house ! no : 12";
        //Output : "21one ! su : oh";
        char[] charArray = str.toCharArray();

        System.out.println("Input string: " + str);
        reverse(charArray);
        String revStr = new String(charArray);

        System.out.println("Output string: " + revStr);
        
    }
}


//
//        if(str[s] >= 'a' && str[s] <= 'z' && str[e] >= '0' && str[e] <= '9')
//        {
//             swap(str,s,e);
//             s++;
//             e--;
//        }
//        else if(str[s] >= '0' && str[s] <= '9' && str[e] >= '0' && str[e] <= '9')
//        {
//             swap(str,s,e);
//             s++;
//             e--;
//        }
//        else if(str[s] >= 'a' && str[s] <= 'z' && str[e] >= 'a' && str[e] <= 'z')
//        {
//             swap(str,s,e);
//             s++;
//             e--;
//        }
//        else if(!(str[s] >= 'a' && str[s] <= 'z' || str[s] >= '0' && str[s] <= '9'))
//        {
//             s++;
//        }
//        else if (!(str[e] >= 'a' && str[e] <= 'z' || str[e] >= '0' && str[e] <= '9'))
//        {
//             e--;
//        }
