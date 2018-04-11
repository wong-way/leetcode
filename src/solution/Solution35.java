package solution;

/**
 * Created by DELL on 2017-07-07.
 */
public class Solution35 {
    public static int searchInsert(int[] nums, int target) {
        int i;
        for(i = 0; i<nums.length; i++){
            if(nums[i] >= target)
                break;
        }
        return i;
    }

    public static void main(String[] args) {
        int[] test = {1, 3, 5, 6};
        int result= searchInsert(test,5);
        System.out.println(result);


    }
}