package leetcode.sliding_window;

import java.util.HashMap;

public class Longest_Repeating_Character_Replacement {
    class Solution {
        public int characterReplacement(String s, int k) {
            HashMap<Character, Integer> count = new HashMap<>();
            int left = 0, right = 0;
            int maxCount = 0, maxLength = 0;

            while (right < s.length()) {
                char c = s.charAt(right);
                count.put(c, count.getOrDefault(c, 0) + 1);
                maxCount = Math.max(maxCount, count.get(c));

                while ((right - left + 1) - maxCount > k) {
                    char leftChar = s.charAt(left);
                    count.put(leftChar, count.get(leftChar) - 1);
                    left++;
                }

                maxLength = Math.max(maxLength, right - left + 1);
                right++;
            }

            return maxLength;
        }
    }
}
