package Recursion.Easy;

public class countElementinArray {

    static void countEle(int[] arr, int i, int target, int count){
        if(i>=arr.length){
            System.out.println(count);
            return;
        }

        if(arr[i] == target){
            count++;
        }

        countEle(arr,i+1,target,count);
    }

    public static void main(String[] args) {
        int[] arr = {10,20,40,10,10,30,10,40,10};
        int target = 10;
        int i =0;
        int count = 0;
        countEle(arr,i,target,count);
    }
}
