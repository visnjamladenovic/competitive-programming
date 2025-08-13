package leetcode.arrays_and_hashing;

public class Remove_Duplicates_From_Sorted_Array_II {
    public int removeDuplicates(int[] nums) {
        int k=0;
        for(int i=0; i<nums.length; i++){
            if(k<2 || nums[i]!=nums[k-2]){
                nums[k++]=nums[i];
            }
        }
        return k;
    }
}
