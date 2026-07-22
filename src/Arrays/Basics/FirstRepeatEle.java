package Arrays.Basics;

public class FirstRepeatEle {
    static int repeat(int[] arr){
        int n = arr.length;
        int j = 0;
        int m = arr[j];
        for (int i=1 ; i<n ; i++){
            if ( m != arr[i]){
                j++;
            }
        }
        return m;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,4};
        System.out.println(repeat(arr));
    }
}
