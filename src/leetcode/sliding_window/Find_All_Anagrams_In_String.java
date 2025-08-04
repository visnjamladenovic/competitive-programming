package leetcode.sliding_window;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Find_All_Anagrams_In_String {
    public List<Integer> findAnagrams(String s, String p) {
        int lenS = s.length();
        int lenP = p.length();

        List<Integer> result = new ArrayList<>();

        int[] expectedFreq = new int[26];
        int[] windowFreq = new int[26];

        for(char c:p.toCharArray()){
            expectedFreq[c-'a']++;
        }

        int left =0, right =0;
        while(right < lenS){
            windowFreq[s.charAt(right) - 'a']++;

            if(right - left + 1 == lenP){
                if(Arrays.equals(windowFreq, expectedFreq)){
                    result.add(left);
                }

                windowFreq[s.charAt(left) - 'a']--;
                left++;
            }
            right++;
        }
        return result;
    }
}
