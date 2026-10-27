package Stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class PrintMidElementInStack {

    static void printMidStack(Deque<Integer> st, int count, int size){
        //base case
        if(count == size/2){
            int midElement = st.peek();
            System.out.println("Middle Element is" + midElement);
        }

        count++;
        st.pop();

        printMidStack(st,count,size);
    }

    public static void main(String[] args) {
        Deque<Integer> st = new ArrayDeque<>();
        st.push(10);
        st.push(30);
        st.push(20);
        st.push(44);
        st.push(90);

        int size = st.size();
        int count = 0;

        printMidStack(st,count,size);
    }
}
