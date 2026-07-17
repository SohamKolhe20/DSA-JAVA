package Basics;

public class Arrayintersection {
    static int[] Inter(int[] arr, int[] brr){
        int[] ans = new int[arr.length];
        for (int i=0 ; i< arr.length ; i++){
            for (int j=0 ; j< brr.length ; j++){
                if (arr[i]==brr[j]){
                    ans[i]=arr[i];
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {2,4,3,5,6,7};
        int[] brr = {1,4,5,9,10};
        int[] answer = Inter(arr,brr);
        for (int i : answer){
            System.out.println(i);
        }
    }
}
