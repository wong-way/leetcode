package solution;

/**
 * Created by DELL on 2017-07-02.
 */
public class Solution9 {
    public static boolean isPalindrome(int x) {
        String numString = Integer.toString(x);
        for (int i = 0; i <numString.length() ; i++) {
            if(numString.charAt(i)!=numString.charAt(numString.length()-1-i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        int test=123454321;
    }
}
