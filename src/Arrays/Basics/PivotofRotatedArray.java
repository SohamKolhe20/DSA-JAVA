package Arrays.Basics;

public class PivotofRotatedArray {
    static int rotated(int[] arr){
        int n = arr.length;
        int s = 0;
        int e = n-1;
        int index=-1;
        while(s<=e){
            int mid = s + (e-s)/2;
            if(arr[mid]>= arr[n-1]){
                s = mid+1;
                index = mid;
            }
            else {
                e = mid-1;

            }
        }
        return index;

    }

    public static void main(String[] args) {

        int[] arr = {60,70,80,90,100,10,20,30,40,50};
        int n = arr.length;
        System.out.println(rotated(arr));
    }
}
