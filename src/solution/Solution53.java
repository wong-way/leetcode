package solution;

/**
 * Created by DELL on 2017-07-09.
 */
public class Solution53 {
    public static int maxSubArray(int[] nums) {
        int max = nums[0];
        int temp = 0;
        for(int i= 0 ; i< nums.length ; i++){
            temp += nums[i];
            if(temp>max)
            {
                max = temp;
            }
            if(temp<0){
                temp = 0;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] test = {-2,1,-3,4,-1,2,1,-5,4};
        int result = maxSubArray(test);
        System.out.println(result);

    }
}
