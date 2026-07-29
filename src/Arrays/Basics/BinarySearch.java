package Arrays.Basics;
import java.util.Scanner;
// In Binary Search we divide the Array in three parts, Middle, Left and Right
public class BinarySearch {
    static int binary(int[] nums, int target){
        int n = nums.length;
        int start = 0;
        int end = n-1;
        // Find the middle index
        int mid = (start+end)/2;

        while(start <= end){
            // Check if target is at middle index, if yes then return mid index
            if( nums[mid] == target){
                return mid;
            }
            // if target value is greater than the mid element then set the start to mid + 1
            // i.e. we are removing the left side of array
            else if ( nums[mid] < target){
                start = mid + 1;
            }
            // If target is smaller than mid value then set the end to mid - 1
            // remove the right side of array
            else{
                end = mid - 1;
            }
            // Update the mid index of new array
            mid = (start+end)/2;
        }
        return -1;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array length");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Feed the Array Elements");
        for (int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }
        System.out.println("Enter the Target");
        int target = sc.nextInt();
        System.out.println("The Index is = " + binary(nums,target));
    }
}
