package Array.Basics;

public class RemoveElement {
        static int removeElement(int[] nums, int val) {
            int index = 0;
            int n = nums.length;
            for( int i =0 ; i<n ; i++){
                if( nums[i] != val){
                    nums[index] = nums[i];
                    index++;
                }
            }
            return index;
        }

    public static void main(String[] args) {
        int[] nums = {1,2,4,5,6,7};
        int val = 4;
        System.out.println(removeElement(nums,val));
    }
    }

