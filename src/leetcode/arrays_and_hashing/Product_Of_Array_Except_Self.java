package leetcode.arrays_and_hashing;

public class Product_Of_Array_Except_Self {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];

        int zeroCount = 0;
        for (int x : nums) if (x == 0) zeroCount++;

        if (zeroCount > 1) {
            return ans;
        }

        if (zeroCount == 1) {
            int prod = 1;
            int zeroIndex = -1;
            for (int i = 0; i < n; i++) {
                if (nums[i] == 0) zeroIndex = i;
                else prod *= nums[i];
            }
            ans[zeroIndex] = prod;
            return ans;
        }

        int prod = 1;
        for (int x : nums) prod *= x;

        for (int i = 0; i < n; i++) {
            ans[i] = prod / nums[i];
        }
        return ans;
    }
}
