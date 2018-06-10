package solution;

import java.util.Arrays;

/**
 * Created by DELL on 2018-06-10.
 */
public class Solution537 {
    public String complexNumberMultiply(String a, String b) {

        int realNum1 = Integer.parseInt(a.substring(0, a.indexOf('+')));
        int imaginaryNum1 = Integer.parseInt(a.substring(a.indexOf('+') + 1, a.indexOf('i')));

        int realNum2 = Integer.parseInt(b.substring(0, b.indexOf('+')));
        int imaginaryNum2 = Integer.parseInt(b.substring(b.indexOf('+') + 1, b.indexOf('i')));

        int realNum = realNum1 * realNum2 - imaginaryNum1 * imaginaryNum2;
        int imaginaryNum = realNum1 * imaginaryNum2 + realNum2 * imaginaryNum1;

        return realNum + "+" + imaginaryNum + "i";
    }

    public static void main(String[] args) {
        Solution537 solution = new Solution537();
        System.out.println(solution.complexNumberMultiply("1+-2i", "2+3i"));

    }
}
