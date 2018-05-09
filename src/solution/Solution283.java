package solution;

/**
 * Created by DELL on 2018-05-09.
 */
public class Solution283 {
    public void moveZeroes(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==0){
                for (int j = i+1; j < nums.length; j++) {
                    if(nums[j]!=0){
                        int temp = nums[i];
                        nums[i]=nums[j];
                        nums[j]=temp;
                        break;
                    }
                }
            }
        }
    }
    public void moveZeroes1(int[] nums) {
        int pos = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]!=0){
                nums[pos++] = nums[i];
            }
        }
        while(pos<nums.length){
            nums[pos++]=0;
        }
    }
}
