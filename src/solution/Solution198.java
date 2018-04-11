package solution;

/**
 * Created by DELL on 2017-08-07.
 */
public class Solution198 {
    public static int rob(int[] nums) {
        int rob = 0; //max monney can get if rob current house
        int notrob = 0; //max money can get if not rob current house
        for(int i=0; i<nums.length; i++) {
            int currob = notrob + nums[i]; //if rob current value, previous house must not be robbed
            notrob = Math.max(notrob, rob); //if not rob ith house, take the max value of robbed (i-1)th house and not rob (i-1)th house
            rob = currob;
            System.out.println("nums = "+nums[i]+" notrob = "+notrob+" rob = "+rob);
        }
        return Math.max(rob, notrob);
    }

    public static void main(String[] args) {
        int test[] = {1, 2, 3, 4, 5, 6, 45, 7, 6, 7};
        int result = rob(test);
        System.out.println("result "+result);
    }
}
