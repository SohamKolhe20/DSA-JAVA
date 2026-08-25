package Recursion.Easy;

public class printArrayRecur {

    static void printArray(int[] arr, int i){
        int n = arr.length;

        if (i==n){
            return;
        }

        System.out.print(arr[i] + " ");
        printArray(arr,i+1);
    }

    public static void main(String[] args) {
        int i = 0;
        int[] arr = {10,20,30,1,4,5};
        printArray(arr,i);
    }
}
