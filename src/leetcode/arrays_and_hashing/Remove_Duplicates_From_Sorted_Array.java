package leetcode.arrays_and_hashing;

public class Remove_Duplicates_From_Sorted_Array {
    public int removeDuplicates(int[] nums){
        int left=1;

        if(nums.length ==0){
            return 0;
        }
        for(int right=1;right<nums.length;right++){
            if(nums[right]!=nums[right-1]){
                nums[left]=nums[right];
                left++;
            }
        }
        return left;
    }
}
