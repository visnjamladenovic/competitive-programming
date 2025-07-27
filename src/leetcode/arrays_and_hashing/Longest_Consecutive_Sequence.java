package leetcode.arrays_and_hashing;

import java.util.HashSet;
import java.util.Set;

public class Longest_Consecutive_Sequence {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int num:nums) set.add(num);

        int longest=0;
        for(int num:set){
            int current = num;
            int streak = 1;

            while(set.contains(current+1)){
                current++;
                streak++;
            }
            longest=Math.max(longest,streak);
        }
        return longest;
    }
}
