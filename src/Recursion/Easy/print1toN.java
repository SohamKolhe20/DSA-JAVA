package Recursion.Easy;

public class print1toN {

    static void printToN(int N, int count){

        if(count>N){
            return;
        }

        System.out.print(count + " ");
        count++;

        printToN(N,count);
    }

    public static void main(String[] args) {
        int N = 6;
        int count=1;
        printToN(N,count);
    }
}
