package solution;

/**
 * Created by DELL on 2017-08-03.
 */
public class Solution191 {
    public static int hammingWeight(int n) {
        int count= 0;
        for(int i = 0; i< Integer.SIZE ;i++){
            if((n&1)==1 )
                count++;
            n>>=1;
            System.out.println(count);
        }
        return count;
    }
    public int hammingWeight1(int n) {
        int result = 0;
        while (n != 0) {
            if ((n & 1) == 1) {
                result++;
            }
            n = n>>>1;
        }
        return result;
    }

    public static void main(String[] args) {
        int test = 11;
        int result = hammingWeight(test);
        System.out.println(test);
    }

}
