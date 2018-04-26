package solution;

/**
 * Created by DELL on 2018-04-25.
 */
public class Solution647 {
    public int countSubstrings(String s) {
        int len = s.length();
        int count =0;

        for(int i = 0;i<len;i++) {
           count+=isPalindrome(s,i,i);
           count+=isPalindrome(s,i,i+1);
        }
        return count;
    }
    private int isPalindrome(String s,int left,int right){
        int count=0;
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            count++;left--;right++;
        }
        return count;
    }


    public static void main(String[] args) {
        Solution647 solution = new Solution647();
        System.out.println(solution.countSubstrings("abc"));
    }

}
