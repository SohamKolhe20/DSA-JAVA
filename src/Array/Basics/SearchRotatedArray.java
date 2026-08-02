package Array.Basics;

import java.util.Scanner;

public class SearchRotatedArray {
    static int pivot(int[]nums){
        int n = nums.length;
        int s = 0;
        int e = n-1;
        int piv = -1;
        if (nums[0] < nums[n-1])
            return n - 1;

        while (s < e) {
            int mid = s + (e - s) / 2;
            if (nums[mid] > nums[e]) {
                s = mid + 1;
            } else {
                e = mid;
            }
        }
        int minIndex = s;
        return (minIndex - 1 + n) % n;
    }
    static int binary(int[] nums, int target,int s, int e){
        int n = nums.length;
        int index = -1;
        if(n==0){
            return -1;
        }
        while (s<=e){
            int mid = s + (e-s)/2;
            if(nums[mid]<target){
                s = mid + 1;
            }
            else if( nums[mid]>target){
                e = mid -1;
            }
            else{
                return mid;
            }
        }
        return index;
    }
    static int search(int[] nums, int target) {
        int n = nums.length;
        int p = pivot(nums);
        int s1 = 0;
        int e1 = p;
        int s2 = p + 1;
        int e2 = n-1;
        int ind = -1;

        if(n==0){
            return -1;
        }
        if(target >= nums[s1] && target <= nums[p]){
            int res = binary(nums,target,s1,e1);
            return res;
        }
        else if( s2 <= e2 && target >= nums[s2] && target <= nums[e2]){
            int res = binary(nums,target,s2,e2);
            return res;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array dimension");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter Array Elements");
        for (int i = 0; i<n ; i++){
            nums[i] = sc.nextInt();
        }
        System.out.println("Enter target value to search");
        int target = sc.nextInt();
        System.out.println("        ");
        System.out.println(search(nums,target));
    }
}

