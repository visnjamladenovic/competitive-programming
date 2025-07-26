package leetcode.arrays_and_hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Top_K_Frequent_Elements {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> countMap = new HashMap<>();
        for(int num:nums){
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        List<Integer>[] buckets = new List[nums.length+1];
        for(int i=0; i<buckets.length;i++){
            buckets[i] = new ArrayList<>();
        }

        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            int num = entry.getKey();
            int freq = entry.getValue();
            buckets[freq].add(num);
        }

        List<Integer> resultList = new ArrayList<>();
        for(int i=buckets.length -1; i>=0 && resultList.size() < k; i--){
            if(!buckets[i].isEmpty()){
                resultList.addAll(buckets[i]);
            }
        }

        int[] result = new int[k];
        for(int i=0; i<k; i++){
            result[i] = resultList.get(i);
        }

        return result;
    }
}
