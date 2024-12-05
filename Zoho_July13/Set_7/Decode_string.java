package Set_7;

import java.util.Stack;

import java.util.Stack;

class Decode_string {

    public static void main(String[] args) {


        System.out.println(decodeString("3[a]2[bc]"));
    }
    public static String decodeString(String s) {

        Stack<String> st = new Stack<>();
        String temp = "";
        int num = 0;

        for(char c : s.toCharArray())
        {
            if (c == '['){
                st.push(temp);
                st.push(String.valueOf(num));
                temp = "";
                num = 0;
            }
            else if(c == ']')
            {
                int count = Integer.parseInt(st.pop());
                String cur = st.pop();

                for (int i = 0; i < count; i++) {
                    cur += temp;
                }
                temp = cur;
            }
            else if(Character.isDigit(c))
            {
                num = num*10 + (c - '0');
            }
            else {
                temp += c;
            }
        }
        return temp;

    }
}
