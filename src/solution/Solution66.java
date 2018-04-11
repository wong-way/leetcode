package solution;

/**
 * Created by DELL on 2017-07-10.
 */
public class Solution66 {
    public static int[] plusOne(int[] digits) {
        int[] result = new int[digits.length+1];
        int carry = 0;
        result[digits.length]=(digits[digits.length-1]+1)%10;
        carry=(digits[digits.length-1]+1)/10;
        for(int i= digits.length-2; i>=0;i--){

            result[i+1]+=(digits[i])%10+carry;
            carry=(digits[i])/10;
        }
        return result;

    }
    public static void main(String args[]){
        int test[]={1,2,3,9};
        int result[]=plusOne(test);
        for(int x:result)
        {
            System.out.println(x);
        }
    }
}