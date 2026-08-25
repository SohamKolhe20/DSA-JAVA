package Recursion.Easy;

public class searchElementinArray {
    static int searchEle(int[] arr, int i, int target){
        //base
        if (i>=arr.length){
            return -1 ;
        }
        //processing
        if (arr[i]==target){
            return i ;
        }

        //recursion part
        int ans = searchEle(arr,i+1,target);
        return ans;
    }

    public static void main(String[] args) {
        int i =0;
        int target = 77;
        int[] arr= { 10,20,40,77,91};
        System.out.println(searchEle(arr,i,target));
    }
}
