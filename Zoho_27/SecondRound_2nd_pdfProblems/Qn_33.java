package SecondRound_2nd_pdfProblems;

public class Qn_33 {

    public static void main(String[] args) {


        String s1 = "KARTHIKEYAN";
        String s2 = "AEY";

        System.out.println(findSubstring(s1,s2));

        System.out.println(findSubstring1(s1,s2));


    }
    //Solution 1

    public static String findSubstring1(String s1,String s2){

        int start = -1 , end = -1;


        for (int i = 0; i < s1.length(); i++) {
            for (int j = 0; j < s2.length(); j++) {
                if(s1.charAt(i) == s2.charAt(j)){
                    if(start == -1){
                        start = i;
                    }
                    end = i;
                }
            }
        }
        System.out.println(start + " " + end);

        return s1.substring(start,end);

    }

    //Solution 2

    public static String findSubstring(String s1,String s2){

        int start = 0 , end = 0;

        for (int i = 0; i < s2.length(); i++) {

            for (int j = 0; j < s1.length(); j++) {

                if(i == 0){
                    if(s2.charAt(i) == s1.charAt(j)){
                        start = j;
                        break;
                    }
                }
                else{

                    if(s2.charAt(i) == s1.charAt(j)){
                        if(start > j){
                            if(end < start){
                                end = start;
                            }
                            start = j;
                        }
                        else if(end < j){
                            end = j;
                        }
                        break;
                    }
                }
            }
        }

        System.out.println(start + " " + end);

        return s1.substring(start,end+1);
    }
}
