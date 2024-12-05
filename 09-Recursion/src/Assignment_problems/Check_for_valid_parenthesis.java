package Assignment_problems;

import java.util.*;
import java.util.Stack;

public class Check_for_valid_parenthesis {

    public static void main(String[] args) {
        Check_for_valid_parenthesis solution = new Check_for_valid_parenthesis();
        //String s1 = "{[()]}";
        String s2 = "{[(])}";
       // String s3 = "{{[[(())]]}}";

        //System.out.println(solution.is_Par(s1)); // Output: true
        System.out.println(solution.is_Par(s2)); // Output: false
        //System.out.println(solution.is_Par(s3)); // Output: true
    }
    public boolean is_Par(String s) {
        Stack<Character> st = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                st.push(c);
            } else {
                if (st.empty() || (c == ')' && st.peek() != '(') || (c == '}' && st.peek() != '{') || (c == ']' && st.peek() != '[')) {
                    return false;
                }
                st.pop();
            }
        }
        return st.empty();
    }
}
