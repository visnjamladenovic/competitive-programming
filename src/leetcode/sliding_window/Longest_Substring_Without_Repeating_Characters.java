package leetcode.sliding_window;

import java.util.HashSet;
import java.util.Set;

public class Longest_Substring_Without_Repeating_Characters {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> seen = new HashSet<>();
        int lenS = s.length();
        int left =0, right =0, maxLen=0;

        while (right < lenS){
            char current = s.charAt(right);

            while(seen.contains(current)){
                seen.remove(s.charAt(left));
                left++;
            }

            seen.add(current);
            maxLen=Math.max(maxLen,right - left +1);
            right++;
        }
        return maxLen;
    }
}
