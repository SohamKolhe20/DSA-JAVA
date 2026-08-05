package Array.Basics;

import java.util.HashMap;

public class MajorityElement {
    static int majorityElement(int[] nums) {
        HashMap<Integer,Integer> mapr = new HashMap<>();
        int n = nums.length;
        for(int i : nums){
            mapr.put(i, mapr.getOrDefault(i,0) + 1);
        }
        n = n/2;

        for(HashMap.Entry<Integer, Integer> entry : mapr.entrySet()){
            if(entry.getValue()>=n){
                return entry.getKey();
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,2,4,2,5,2,5,2,6,2,5,2};
        System.out.println(majorityElement(nums));
    }
}
