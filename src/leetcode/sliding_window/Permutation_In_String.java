package leetcode.sliding_window;

import java.util.HashMap;
import java.util.Map;

public class Permutation_In_String {
    public boolean checkInclusion(String s1, String s2) {
        int len1 = s1.length(), len2=s2.length();
        if(len1 > len2){
            return false;
        }

        Map<Character, Integer> permutationMap = new HashMap<>();
        for (char c : s1.toCharArray()) {
            permutationMap.put(c, permutationMap.getOrDefault(c, 0) + 1);
        }

        Map<Character, Integer> windowMap = new HashMap<>();

        int requiredWindowSize = permutationMap.size();
        int matches = 0;

        int left = 0, right = 0;

        while(right < len2){
            char in = s2.charAt(right);
            if(permutationMap.containsKey(in)){
                int prev = windowMap.getOrDefault(in,0);
                int now = prev + 1;
                windowMap.put(in, now);

                if(now == permutationMap.get(in)){
                    matches++;
                }
                else if(prev == permutationMap.get(in)){
                    matches--;
                }
            }
            right++;

            while(right - left > len1){
                char out = s2.charAt(left);
                if(permutationMap.containsKey(out)){
                    int prev = windowMap.get(out);
                    int now = prev - 1;

                    if(now == 0){
                        windowMap.remove(out);
                    }
                    else{
                        windowMap.put(out,now);
                    }

                    if(now == permutationMap.get(out)){
                        matches++;
                    }
                    if(prev == permutationMap.get(out)){
                        matches--;
                    }
                }
                left++;

            }

            if (right - left == len1 && matches == requiredWindowSize) {
                return true;
            }

        }

        return false;
    }
}
