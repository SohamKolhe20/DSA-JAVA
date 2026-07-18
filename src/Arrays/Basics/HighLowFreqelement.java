
// Identify the elements with Highest and Lowest Frequency.
// Similar to the Mode of the Array, we will use HashMap here to store elements as keys and their repetition as values.

package Arrays.Basics;
import java.util.HashMap;

public class HighLowFreqelement {
    static int[] mode(int[] arr){
        HashMap<Integer, Integer> table = new HashMap<>();
        for(int i : arr){
            table.put(i, table.getOrDefault( i ,0)+1);
        }
        System.out.println();
        System.out.println("HashMap representation");
        System.out.println("Keys " + " Values");
        for(int i : table.keySet()){
            System.out.println( " " + i + "  ->   " + table.get(i));
        }
        System.out.println("------------------------------------------------");

        int Maxkey = -1, Minkey = -1;
        int MaxValue = -1 , MinValue = -1;
        for (int key : table.keySet()){
            int Currentkey = key;
            int Currentvalue = table.get(key);
            if (Currentvalue<MaxValue){
                Minkey = Currentkey;
                MinValue = Currentvalue;
            }
            if (Currentvalue > MaxValue){
                Maxkey = Currentkey;
                MaxValue = Currentvalue;
            }
        }
        int[] ans = {Maxkey , Minkey};
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {2,3,4,2,2,4,3,3,3,5};
        int[] answer = mode(arr);
        System.out.println("Highest frequency = " + answer[0]);
        System.out.println("Lowest frequency = " + answer[1]);
    }
}

