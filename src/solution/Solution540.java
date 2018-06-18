package solution;

public class Solution540 {
    public int singleNonDuplicate(int[] nums) {
        int end = nums.length-1;
        int start =0;
        int mid = (end+start)/2;
        while(end>start){
            int  left = nums[mid-1];
            int right = nums[mid+1];
            if(nums[mid] == left)
            {
                if((mid-start+1)%2 ==1){
                    end = mid-2;

                }else{
                    start =mid+1;

                }
            }
            else if(nums[mid]==right){
                if((end-mid+1)%2 ==1){
                    start = mid+2;

                }else{
                    end =mid-1;

                }
            }
            else{
                return nums[mid];
            }
            mid = (end+start)/2;

        }
        return nums[start];
    }
}
