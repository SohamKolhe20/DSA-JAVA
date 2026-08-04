package Array.Basics;

public class UnionofArray {
    static void union(int[] arr, int[] brr){
        int n = arr.length;
        int[] ans = new int[n];
        for (int i=0 ; i<n ; i++){
            for (int j=0; j < brr.length ; j++){
                if (arr[i] == brr[j]){
                    ans[i] = arr [i];
                }
                if(arr[i] != brr[j]){
                    ans[i] = arr[i];
                    ans[i+1]= brr[j];
                }
            }
        }
        for( int i : ans){
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int[] brr = {1,6,7,8,5};
        union(arr, brr);

    }
}
