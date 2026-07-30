package Arrays.Basics;
import java.util.Scanner;
public class PeakElementMountainArray {
    static int peak(int[] arr){
        int n = arr.length;
        int start = 0;
        int end = n-1;
        int mid = start + (end-start)/2;
        int index= -1;
        while(start <= end){
            if( arr[mid] >= arr[mid+1]){
                end = mid-1;
                index = mid;
            }
            else if( arr[mid] < arr[mid+1]){
                start = mid+1;
            }
            mid = start + (end-start)/2;
        }
        return index;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter Array dimension");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println(" Enter Array elements");
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("The Index at which Peak element is present is " + peak(arr));
    }
}
