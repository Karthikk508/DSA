package PreviousQuestions;

public class Valid_Parenthesis {

    public static boolean check(String str){

        char[] arr = str.toCharArray();


        int i = -1;


        for(char ch : arr){

            if(ch == '(' || ch == '[' || ch == '{'){
                arr[++i] = ch;
            }
            else{

                if(i >= 0 && (arr[i] == '(' && ch == ')') || (arr[i] == '[' && ch == ']') || (arr[i] == '{' && ch == '}')){
                    i--;
                }
                else{
                    return false;
                }
            }
        }

        return i == -1;



    }

    public static void main(String[] args) {


        String str = "{{(())[[]]{}}}";

        System.out.println(check(str));
    }
}
