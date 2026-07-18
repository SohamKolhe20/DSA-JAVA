
// Find the Mode of the Array.
// -> Here Mode means Frequency of elements in an array and mainly Mode is the element with Highest Frequency.
// To find out the frequency of elements in an array, we generally use HASHMAP structure in problem. As it used in the form of Keys and its Values .

package Arrays.Basics;

import java.util.HashMap;

public class ModeofArray {

    static void mode(int[] arr){
        HashMap<Integer, Integer> table = new HashMap<>();
        for(int i : arr){
            table.put(i, table.getOrDefault( i ,0)+1);
        }
        for(int i : table.keySet()){
            System.out.println( i + "->" + table.get(i));
        }
    }

    public static void main(String[] args) {
        int[] arr = {2,3,4,2,2,4,3,3,3,5};
        mode(arr);
    }
}
