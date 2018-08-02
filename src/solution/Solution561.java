package solution;

import java.util.Arrays;

public class Solution561 {
    public int arrayPairSum(int[] nums) {
        int sum = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0)
                sum += nums[i];
        }
        return sum;
    }

    public int arrayPairSum1(int[] nums) {
        int sum = 0;
        int[] bucket = new int[20001];
        for (int i = 0; i < nums.length; i++) {
            bucket[nums[i] + 10000]++;
        }
        int count = 0;
        for (int j = 0; j < bucket.length; j++) {
            while (bucket[j] > 0) {
                if (count % 2 == 0)
                    sum += (j - 10000);
                count++;
                bucket[j]--;
            }
        }
        return sum;
    }
}
