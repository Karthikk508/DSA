package EasyLeetcode;

public class NumberOfStrings {

    public static void main(String[] args) {

        System.out.println(countSegments("hello i am karthik          "));


    }
    public static int countSegments(String s) {
        int res=0;
        for(int i=0; i<s.length(); i++)
            if(s.charAt(i)!=' ' && (i==0 || s.charAt(i-1)==' '))
                res++;
        return res;
    }
}

