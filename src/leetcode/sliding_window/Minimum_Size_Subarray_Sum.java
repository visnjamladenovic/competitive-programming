package leetcode.sliding_window;

public class Minimum_Size_Subarray_Sum {
    public int minSubArrayLen(int target, int[] nums) {
        int result = Integer.MAX_VALUE;
        int left=0,right=0,sum=0;

        for(right = 0; right<nums.length;right++){
            sum+=nums[right];
            while(sum >= target){
                result = Math.min(right - left + 1, result);
                sum = sum - nums[left];
                left++;
            }
        }
        return result == Integer.MAX_VALUE ? 0 : result;

    }
}
