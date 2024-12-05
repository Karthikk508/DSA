package Recursion;

import java.util.Stack;

/*package whatever //do not write package name here */
class Sort_stack {

    public static void main(String[] args) {

        Stack<Integer> s = new Stack<>();

        s.push(4);
        s.push(2);
        s.push(1);

        sort(s);

        System.out.println(s);
    }
    public static Stack<Integer> sort(Stack<Integer> s)
    {
        if (s.empty() == true) {
            return s;
        }

        // Remove the top element
        int top = s.peek();
        s.pop();
        // Recursion for the remaining elements in the stack
        sort(s);
        // Insert the popped element back in the sorted stack
        sortedInsert(s, top);
        return s;
    }
    public static void sortedInsert(Stack<Integer> stack, int current) {
        if (stack.empty() == true || current > stack.peek()) {
            stack.push(current);
            return;
        }

        // Remove the top element
        int top = stack.peek();
        stack.pop();
        // Recursion for the remaining elements in the stack
        sortedInsert(stack, current);
        // Insert the popped element back in the stack
        stack.push(top);
    }
}