package solution;

/**
 * Created by DELL on 2018-04-22.
 */
public class Solution303 {
    int[] sumArr;

    public Solution303(int[] nums) {
        for(int i = 1; i < nums.length; i++)
            nums[i] += nums[i - 1];
        this.sumArr = nums;
    }

    public int sumRange(int i, int j) {
        if(i==0)
            return sumArr[j];
        return sumArr[j]-sumArr[i-1];
    }

    public static void main(String[] args) {
        int arr[] ={-2, 0, 3, -5, 2, -1};
        Solution303 solution = new Solution303(arr);
        System.out.println(solution.sumRange(0,2));
    }
}
