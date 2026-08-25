package Recursion.Easy;

public class MaxElementRec {
    static void maxElement(int[] arr,int i, int max){
        if(i>=arr.length){
            System.out.println("Max Value " + max);
            return;
        }

        if(arr[i]>max){
            max=arr[i];
        }

        maxElement(arr,i+1,max);
    }

    public static void main(String[] args) {
        int i = 0;
        int max = Integer.MIN_VALUE;
        int[] arr = {10,30,20,44,67,99};
        maxElement(arr,i,max);

    }
}
