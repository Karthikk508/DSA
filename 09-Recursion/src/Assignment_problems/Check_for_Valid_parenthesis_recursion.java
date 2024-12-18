package Assignment_problems;
import java.util.Arrays;

public class Check_for_Valid_parenthesis_recursion {

    public static void main(String[] args) {

        String s = "{[()]}[()]{}(()){}{}";

        char[] expr = s.toCharArray();
        int n = expr.length;
        if (check(expr, n)) {
            System.out.println("Balanced");
        }
        else
            System.out.println("Not Balanced");
    }
    static boolean check(char[] expr, int n)
    {
        // Base cases
        if (n == 0)
            return true;
        if (n == 1)
            return false;
        if (expr[0] == ')' || expr[0] == '}' || expr[0] == ']')
            return false;

        char closing = findClosing(expr[0]);

        int i, count = 0;
        for (i = 1; i < n; i++)
        {
            if (expr[i] == expr[0])
                count++;
            if (expr[i] == closing) {
                if (count == 0)
                    break;
                count--;
            }
        }
        if (i == n)
            return false;

        if (i == 1)
            return check(Arrays.copyOfRange(expr, i + 1, n), n - 2);

        return check(Arrays.copyOfRange(expr, 1, i), i - 1) && check(Arrays.copyOfRange(expr, (i + 1), n), n - i - 1);
    }
    static char findClosing(char c)
    {
        if (c == '(')
            return ')';
        if (c == '{')
            return '}';
        if (c == '[')
            return ']';
        return Character.MIN_VALUE;
    }
}

