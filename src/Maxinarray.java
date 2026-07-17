public class Maxinarray {
    static int Finder(int[] arr){
        int a = 1;
        for (int i : arr){
            if (i>a) a = i ;


        }
        return a;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,4,50,5,10,3};
        int ans = Finder(arr);
        System.out.println(ans);
    }
}
