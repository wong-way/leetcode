package solution;

/**
 * Created by DELL on 2017-07-11.
 */
public class Solution70 {
    public static int climbStairs(int n) {
        if(n == 0)
            return 0;
        else if(n == 1)
            return 1;
        else if(n == 2)
            return 2;
        return climbStairs(n-1)+climbStairs(n-2);
    }
    public static void main(String[] args) {
        int test = 44;
        int result = climbStairs(test);
        System.out.println(result);
    }
}
