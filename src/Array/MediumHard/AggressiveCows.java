package Array.MediumHard;

public class AggressiveCows {
    public int aggressiveCows(int[] arr, int k) {
        int n = arr.length;
        Arrays.sort(arr);
        int s = 0;
        int maxDistance = arr[n-1] - arr[0];
        int e = maxDistance;

        while(s <= e){
            int mid = s + (e-s)/2;

            if(isValidSol(mid)){

            }
        }

    }
}
