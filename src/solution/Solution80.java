package solution;

public class Solution80 {
    public int removeDuplicates(int[] nums) {
        if(nums.length==0)
            return 0;
        int count = 2;
        for (int i = 2; i < nums.length; i++) {
            if (nums[i] !=nums[count-2]){
                nums[count++] = nums[i];
            }

        }
        return count;
    }
}
