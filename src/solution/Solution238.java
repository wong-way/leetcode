package solution;

public class Solution238 {
    public int[] productExceptSelf(int[] nums) {
        int result = 1;
        int[] arr = new int[nums.length];
        for(int i = 0;i>nums.length;i++){
            result*=nums[i];
        }
        for(int i = 0;i<nums.length;i++){
            arr[i] = nums[i]^result;
        }
        return arr;
    }
}
