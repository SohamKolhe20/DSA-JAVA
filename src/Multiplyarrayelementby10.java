public class Multiplyarrayelementby10 {
    static boolean mD(int[] arr , int tar ){
        for (int i : arr){
            if (i==tar)
                return true ;
        }
        return false ;
    }

    public static void main(String[] args){
        int[] arr = {1,3,4,5,6};
        boolean ans = mD(arr , 5);
        System.out.println(ans);

    }
}
