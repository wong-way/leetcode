package solution;

/**
 * Created by DELL on 2017-07-16.
 */
public class Solution171 {
    public static int titleToNumber(String s) {
        int result = 0;
        for(int i =0 ;i< s.length();i++){
            result += (s.charAt(i) - 'A'+1) * Math.pow(26, s.length() - 1 - i);
        }
        return result;
    }

    public static void main(String[] args) {
        String test="AB";
        int result = titleToNumber(test);
        System.out.println(result);
    }
}
