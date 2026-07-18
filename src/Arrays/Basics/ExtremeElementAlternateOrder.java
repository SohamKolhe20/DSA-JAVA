
// Print Extreme Elements in an Alternate Manner.

package Arrays.Basics;

public class ExtremeElementAlternateOrder {
    static void alternate(int[] arr){
        int n = arr.length:
        int j = n-1;
        int i = 0;
        while(i<j){
            System.out.print(arr[i] + " ");
            System.out.print(arr[j] + " ");
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6};
        alternate(arr);
    }
}
