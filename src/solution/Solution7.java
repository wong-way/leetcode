package solution;

/**
 * Created by DELL on 2017-07-02.
 */
public class Solution7 {
    public static int reverse(int x) {
        int result = 0;
        while (x != 0) {
            int length =x%10;
            int newResult = result * 10 + length;
            if((newResult-length)/10 != result){
                return 0;
            }
            x /= 10;
            result = newResult;
        }
        return result;
    }
    public static int reverse1(int x) {
        long result = 0;
        while (x != 0) {
            int length =x%10;
            result = result * 10 + length;
            if(result>Integer.MAX_VALUE||result<Integer.MIN_VALUE){
                return 0;
            }
            x /= 10;
        }
        return (int)result;
    }

    public static void main(String[] args) {
        int x = 1534236469;
        int result = reverse(x);
        System.out.println(result);
    }
}
