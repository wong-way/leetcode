package solution;

/**
 * Created by DELL on 2017-07-12.
 */
public class Solution88 {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        m=m-1;
        n= n -1 ;
        for(int i=m+n+1;i>=0;i--){
            if(m<0)
                nums1[i]=nums2[n--];
            else if(n<0)
                nums1[i]=nums1[m--];
            else {
                nums1[i] = nums2[n] > nums1[m] ? nums2[n--] : nums1[m--];
            }
        }

    }
    public static void main(String args[]){
        int num1[]=new int[13];
        num1[0]=1;
        num1[1]=2;
        num1[2]=3;
        num1[3]=4;
        num1[4]=5;
        num1[5]=16;
        int num2[]={1,5,7,9,45,56,69};
        merge(num1,6,num2,7);
    }
}
