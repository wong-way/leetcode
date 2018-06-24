package solution;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution347 {
    public List<Integer> topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> keyMap = new HashMap<Integer, Integer>();
        List<Integer>[] bucket = new List[nums.length + 1];
        for (int n : nums) {
            keyMap.put(n, keyMap.getOrDefault(n, 0) + 1);
        }
        for (int key : keyMap.keySet()) {
            int frequency = keyMap.get(key);
            if (bucket[frequency] == null) {
                bucket[frequency] = new ArrayList<>();
            }
            bucket[frequency].add(key);
        }

        List<Integer> res = new ArrayList<>();

        for(int pos = bucket.length-1; pos >= 0; pos--){
            if(bucket[pos] != null){
                for(int i = 0; i < bucket[pos].size() && res.size() < k; i++)
                    res.add(bucket[pos].get(i));
            }
        }
        return res;

    }
}
