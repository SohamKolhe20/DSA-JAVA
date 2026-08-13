package Array.MediumHard;

import java.util.Scanner;

public class PainterPartition {
    static boolean isValidSol(int[] arr, int k, int maxTime){
        int painterCount = 1;
        int timeTaken = 0;

        for(int i = 0 ; i < arr.length ; i++){

            if(timeTaken + arr[i] <= maxTime){
                timeTaken += arr[i];
            }
            else{
                painterCount++;
                timeTaken=arr[i];
                if(arr[i] > maxTime || painterCount > k){
                    return false;
                }
            }

        }
        return true;
    }

    static int minTime(int[] arr, int k) {
        int n = arr.length;
        int maxTime = 0;
        for(int i = 0 ; i < n ; i++){
            maxTime += arr[i];
        }
        // Range of Binary Search on answer
        int s = 0;
        int e = maxTime;
        int ans = -1;

        while(s <= e){
            int mid = s + (e-s)/2;

            if(isValidSol(arr, k, mid)){
                ans = mid;
                e = mid - 1;
            }
            else{
                s = mid + 1;
            }
        }
        return ans;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array length");
        int n = sc.nextInt();
        System.out.println("Enter Array Element");
        int[] arr = new int[n];
        for (int i = 0; i< n ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter Number of Painters");
        int k = sc.nextInt();
        System.out.println( "The Minimum Time to paint all the frame is");
        System.out.println(minTime(arr,k));
    }
}
