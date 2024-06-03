package recursion;

import java.util.Stack;

public class reverseStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(3);
        stack.push(2);
        stack.push(1);
        stack.push(7);
        stack.push(6);

        reverse(stack);

        System.out.println(stack);
    }

    static void reverse(Stack<Integer> s) {
//        base case
        if (!s.isEmpty()) {
            return;
        }
        int top = s.pop();
        s.push(top);
        reverse(s);


    }

}
