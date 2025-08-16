package leetcode.arrays_and_hashing;

public class Rotate_Array {
    public void rotate(int[] nums, int k) {
        int len=nums.length;
        k%=len;
        reverse(nums,0,len-1);
        reverse(nums,0,k-1);
        reverse(nums,k,len-1);
    }

    private void reverse (int []nums, int i, int j){
        while(i<j){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j--;
        }
    }
}
