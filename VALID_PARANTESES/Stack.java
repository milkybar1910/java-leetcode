
// Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

// An input string is valid if:

// Open brackets must be closed by the same type of brackets.
// Open brackets must be closed in the correct order.

// Example 1:

// Input: s = "()"
// Output: true

package VALID_PARANTESES;

public class Stack {
    // Stack head;
    // int top = -1;
    // int data;
    // char[] stackArray;

    // Stack(int d) {
    // this.data = d;
    // stackArray = new char[d];
    // }

    // public void push(char data) {
    // stackArray[++top] = data;
    // }

    // public int pop(char data) {
    // if (data == '}') {
    // if (stackArray[top] == '{') {
    // top--;
    // return 1;
    // } else {
    // return 0;
    // }
    // } else if (data == ']') {
    // if (stackArray[top] == '[') {
    // top--;
    // return 1;
    // } else {
    // return 0;
    // }
    // } else if (data == ')') {
    // if (stackArray[top] == '(') {

    // top--;
    // return 1;
    // } else {
    // return 0;
    // }
    // }
    // return 1;
    // }

    public static boolean isValid(String s) {
        char[] stackArray = new char[s.length()];
        int top = -1;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '{' || s.charAt(i) == '[' || s.charAt(i) == '(') {
                stackArray[++top] = s.charAt(i);

            } else if (s.charAt(i) == '}') {
                if (top == -1) {
                    return false;
                }
                if (stackArray[top] == '{')
                    top--;
                else
                    return false;
            } else if (s.charAt(i) == ')') {
                if (top == -1) {
                    return false;
                }
                if (stackArray[top] == '(') {
                    top--;
                } else
                    return false;
            } else if (s.charAt(i) == ']') {
                if (top == -1) {
                    return false;
                }
                if (stackArray[top] == '[')
                    top--;
                else
                    return false;
            }
        }
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        String s = "()[{{}}]";
        boolean result = isValid(s);
        System.out.println(result);
        // Stack stack = new Stack(s.length());
        // for (int i = 0; i < s.length(); i++) {
        // switch (s.charAt(i)) {
        // case '{':
        // stack.push(s.charAt(i));

        // case '[':
        // stack.push(s.charAt(i));

        // case '(':
        // stack.push(s.charAt(i));

        // case '}':
        // int result = stack.pop(s.charAt(i));
        // if (result == 0) {
        // System.out.println("INVALID");
        // return;
        // }
        // case ']':
        // int result1 = stack.pop(s.charAt(i));
        // if (result1 == 0) {
        // System.out.println("INVALID");
        // return;
        // }
        // case ')':
        // int result2 = stack.pop(s.charAt(i));
        // if (result2 == 0) {
        // System.out.println("INVALID");
        // return;
        // }
        // default:
        // break;
        // }
        // }
        // System.out.println("VALID");
    }
}
