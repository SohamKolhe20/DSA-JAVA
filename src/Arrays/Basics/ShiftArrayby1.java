package Arrays.Basics;

public class ShiftArrayby1 {
    static void shift(int[] arr){
        int n = arr.length;
        int temp = arr[n-1];
        for(int i=n-1; i>0;i--){
            arr[i] = arr[i-1];

        }
        arr[0] = temp;

    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        shift(arr);

        for (int a: arr){
                System.out.print(a + " ");
            }
        }
}
