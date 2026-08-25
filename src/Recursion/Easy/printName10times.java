package Recursion.Easy;

public class printName10times {

    static void printNames(int n){
        if(n==0){
            return;
        }
        System.out.println("Ravan");
        printNames(n-1);
    }

    public static void main(String[] args) {
        int n = 10;
        printNames(n);
    }
}
