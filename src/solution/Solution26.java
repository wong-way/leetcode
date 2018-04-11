package solution;

/**
 * Created by DELL on 2017-07-06.
 */
public class Solution26 {
    public static int removeDuplicates(int[] nums) {
        if(nums.length==0)
            return 0;
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]){
                nums[count++]=nums[i];
            }
        }
        return count;
    }
    public static int test(int[] A){
        if (A.length==0) return 0;
        int j=0;
        for (int i=0; i<A.length; i++)
            if (A[i]!=A[j])
                A[++j]=A[i];
        return ++j;
    }


    public static void main(String args[]) {
        int[] test = new int[]{-999,-999,-998,-998,-997,-997,-996,-996,-995,
                -995,-994,-994,-993,-993,-992,-992,-991,-991,-990,-990,-989,
                -989,-988,-988,-987,-987,-986,-986,-985,-985,-984,-984,-983,
                -983,-982,-982,-981,-981,-980,-980,-979,-979,-978,-978,-977};
        int[]test1={1,2};
        int result = 0;
        result = removeDuplicates(test1);
        System.out.println(result);
    }
}