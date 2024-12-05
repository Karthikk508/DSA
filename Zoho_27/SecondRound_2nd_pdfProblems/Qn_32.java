package SecondRound_2nd_pdfProblems;

public class Qn_32 {

    public static void main(String[] args) {

    }
    public static void find(String str){


        int lowerCase = 0 , upperCase = 0 , specialChar = 0 ,count = 0 , digit = 0;


        for (int i = 0; i <str.length(); i++) {

            if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z'){
                lowerCase++;
                if(lowerCase == 1){
                    count++;
                }
            }
            if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z'){
                upperCase++;
                if(upperCase == 1){
                    count++;
                }
            }
            if(check(str.charAt(i))){
                specialChar++;
                if(specialChar == 1){
                    count++;
                }
            }
            if(str.charAt(i) >= '0' && str.charAt(i) <= '9'){
                digit++;
                if(digit == 1){
                    count++;
                }
            }
        }

        System.out.println(count);

    }

    public static boolean check(char ch){
        return ch == '!' || ch == '@' || ch == '#' || ch == '$' || ch == '%' || ch == '^' || ch == '&' || ch == '*' || ch == '(' || ch == ')' || ch == '-' || ch == '+';
    }
}
