package Array.MediumHard;

import java.util.ArrayList;
import java.util.List;

public class Permutation {
    static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        permute(nums, 0, res);
        return res;
    }

    private void permute(int[] nums, int i, List<List<Integer>> res) {
        if (i == nums.length) {
            List<Integer> permutation = new ArrayList<>();
            for (int num : nums) permutation.add(num);
            res.add(permutation);
            return;
        }

        for (int j = i; j < nums.length; j++) {
            swap(nums, i, j);
            permute(nums, i + 1, res);
            swap(nums, i, j); // backtrack
        }
    }

    private void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}
