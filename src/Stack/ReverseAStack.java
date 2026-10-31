package Stack;

import java.util.Stack;

public class ReverseAStack {
    public static void reverseStack(Stack<Integer> st) {
        int[] arr = new int[st.size()];
        int n = arr.length;
        for(int i = 0; i<n; i++){
            arr[i] = st.peek();
            st.pop();
        }
        for(int i = 0; i<n; i++){
            st.push(arr[i]);
        }
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);

        reverseStack(st);
        System.out.println(st);
    }
}
