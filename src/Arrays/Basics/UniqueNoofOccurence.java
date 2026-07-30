package Arrays.Basics;

import java.util.HashMap;
import java.util.HashSet;

public class UniqueNoofOccurence {
        static boolean uniqueOccurrences(int[] arr) {
            HashMap<Integer, Integer> uniq = new HashMap<>();
            int n = arr.length;
            for( int i : arr){
                uniq.put(i, uniq.getOrDefault(i,0)+1);
            }
            HashSet<Integer> s = new HashSet<>();
            for (int x : uniq.values()) {
                s.add(x);
            }

            return uniq.size() == s.size();
        }

    public static void main(String[] args) {
        int[] arr = {10,20,20,30,30,30};
        System.out.println(uniqueOccurrences(arr));
    }
    }

