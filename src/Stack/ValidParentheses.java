package Stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class ValidParentheses {

    static boolean valid(String s) {
        Deque<Character> st = new ArrayDeque<>();
        for (char ch : s.toCharArray()) {

            if (ch == '{' || ch == '[' || ch == '(') {
                st.push(ch);
            } else {
                //if ch is a closing bracket
                // check top of the stack and if top is the opening
                // bracket for our current ch-closing then cancel then out
                // but first check whether the stack is empty or not

                if (st.isEmpty()) {
                    return false;
                }
                if (ch == '}' && st.peek() != '{') {
                    //no match
                    return false;
                } else if (ch == ']' && st.peek() != '[') {
                    //no match
                    return false;
                } else if (ch == ')' && st.peek() != '(') {
                    //no match
                    return false;
                } else {
                    st.pop();
                }
            }
        }
        if (st.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        String s = "[()]";
        System.out.println(valid(s));
    }
}