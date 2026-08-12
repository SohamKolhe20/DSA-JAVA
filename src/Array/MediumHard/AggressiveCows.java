package Array.MediumHard;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class AggressiveCows {
    static boolean isValidSol(int[] arr, int k, int MinDis){
        int cowCount = 1;
        int firstposition = 0;
        for(int i = 1 ; i< arr.length; i++){

            if(arr[i] - arr[firstposition] >= MinDis){
                cowCount++;
                firstposition = i;
            }

            if(cowCount == k){
                return true;
            }

        }
        return false;
    }

    static int aggressiveCows(int[] arr, int k) {
        int n = arr.length;
        Arrays.sort(arr);
        int s = 0;
        int maxDistance = arr[n-1] - arr[0];
        int e = maxDistance;
        int ans = -1;

        while(s <= e){
            int mid = s + (e-s)/2;

            if(isValidSol(arr, k, mid)){
                s = mid +1;
                ans = mid;
            }
            else{
                e = mid -1;
            }
        }
        return ans;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Length");
        int n = sc.nextInt();
        System.out.println("Enter Array Element");
        int[] arr = new int[n];
        for (int i = 0; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter Number of Cows");
        int k = sc.nextInt();
        System.out.println();
        System.out.println("The Maximum of Minimum Distance between Cows is ");
        System.out.println(aggressiveCows(arr,k));
    }
}
