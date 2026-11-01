package Stack;

import java.util.Stack;

public class InsertAtBottomStack {
    public static void inserter(Stack<Integer> st, int val){
        //base case
        if(st.empty()){
            st.push(val);
            return;
        }
        //solving 1 case before recursion
        int topVal = st.peek();
        st.pop();
        //recursion
        inserter(st,val);
        //after recursion
        st.push(topVal);
    }
    public Stack<Integer> insertAtBottom(Stack<Integer> st, int x) {
        int val = x;
        inserter(st,val);
        return st;
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        System.out.println(st);
    }
}
