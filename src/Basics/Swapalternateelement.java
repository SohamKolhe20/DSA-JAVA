package Basics;

public class Swapalternateelement {
    static int[] Swap(int[] arr){
        int [] brr = new int[arr.length];
        for (int i=0 ; i< arr.length ; i+=2){
            arr[i]+= arr[i+1];
            arr[i+1]= arr[i]-arr[i+1];
            arr[i]= arr[i]-arr[i+1];
            brr[i] = arr[i];
            brr[i+1] = arr [i+1];
        }
        return brr ;
    }

    public static void main(String[] args) {
        int [] arr = {1,2,4,5,6,8};
        int [] ans = Swap(arr);
        for(int i : ans ){
            System.out.print(i + " ");
        }
    }
}
