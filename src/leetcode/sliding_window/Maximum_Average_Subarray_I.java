package leetcode.sliding_window;

public class Maximum_Average_Subarray_I {
        public double findMaxAverage(int[] nums, int k) {
            double sum=0,maxSum=0;
            int i=0;
            if(nums.length ==1){
                return nums[i];
            }

            for( i=0; i<k; i++){
                sum+=nums[i];
            }

            maxSum=sum;
            for( i=k; i<nums.length; i++){
                sum += nums[i] - nums[i - k];
                maxSum = Math.max(maxSum, sum);
            }
            return maxSum/k;
        }
}
