package Round_2;

import java.util.Scanner;

public class _7_Evaluate_expression {


    static boolean strChr(String str, char ch) {
        return str.indexOf(ch) != -1;
    }

    public static void main(String[] args) {

        //Scanner sc = new Scanner(System.in);

        String close = ")]";
        String open = "([";
        String operators = "+*/-";

        String str = "(a+b)(c+d+e)";
        char[] paran = new char[100];
        char[] operand = new char[100];

        int top_p = -1, top_o = -1, ind = 0;
        char pop;
        boolean flag;

        for (ind = 0; ind < str.length(); ind++) {

            if (strChr(open, str.charAt(ind))) {
                paran[++top_p] = str.charAt(ind);
            } else if (strChr(close, str.charAt(ind))) {
                if (top_p == -1) {
                    break;
                } else {
                    pop = paran[top_p];
                    flag = false;

                    switch (pop) {
                        case '(':
                            if (str.charAt(ind) != ')') flag = true;
                            break;
                        case '[':
                            if (str.charAt(ind) != ']') flag = true;
                            break;
                    }

                    if (flag) {
                        break;
                    } else {
                        paran[top_p--] = 0;
                    }
                }
            } else if (str.charAt(ind) >= 'a' && str.charAt(ind) <= 'z') {
                operand[++top_o] = str.charAt(ind);
            } else if (strChr(operators, str.charAt(ind))) {
                if (top_o == -1) {
                    break;
                } else {
                    operand[top_o--] = 0;

                    if (!(str.charAt(ind + 1) >= 'a' && str.charAt(ind + 1) <= 'z')) {
                        break;
                    } else {
                        ind++;
                        if (strChr(operators, str.charAt(ind + 1))) {
                            operand[++top_o] = str.charAt(ind);
                        }
                    }
                }
            }
        }

        if (ind == str.length() && top_o == -1 && top_p == -1) {
            System.out.println("VALID");
        } else {
            System.out.println("INVALID");
        }

        //sc.close();
    }
}
