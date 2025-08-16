package leetcode.arrays_and_hashing;

import java.util.HashSet;
import java.util.Set;

public class Longest_Consecutive_Sequence {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int x : nums) set.add(x);

        int longest=0;
        for(int x:set){
            if(!set.contains(x-1)){
                int current=x;
                int len=1;
                while(set.contains(current+1)){
                    current++;
                    len++;
                }
                longest=Math.max(longest,len);
            }
        }
        return longest;

    }
}
