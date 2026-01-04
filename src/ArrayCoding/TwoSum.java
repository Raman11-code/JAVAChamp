package ArrayCoding;

import java.util.Arrays;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    //To print the index of thr number
                    return new int[]{i, j};
                    //To print the combination of to number
                    //    return new int[] {nums[i],nums[j]};

                }
            }
        }
        return null;
    }

    //Sum,Target Coding
    public static void main(String args[]) {
        int[] nums = {2, 7, 11, 15};
        int target = 17;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }
}
