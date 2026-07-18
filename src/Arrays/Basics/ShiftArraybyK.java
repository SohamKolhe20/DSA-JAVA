package Arrays.Basics;

public class ShiftArraybyK {
    static void shift (int[] arr , int k ){
        int n = arr.length;
        int[] temp = new int[k];

        for (int i = 0; i < k; i++) {
            temp[i] = arr[n - k + i];
        }
        for (int i = n-1 ; i>=k ; i--){
            arr[i] = arr[i-k];
        }
        for (int i = 0 ; i<k ; i++){
            arr[i] = temp[i];
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int k = 4;
        shift(arr , k);

        for (int ans: arr){
            System.out.print(ans + " ");
        }
    }
}
