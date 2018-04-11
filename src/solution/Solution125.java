package solution;

/**
 * Created by DELL on 2017-07-21.
 */
public class Solution125 {
    public static boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int i=0;
        int j = s.length()-1;
        char a;
        char b ;
        while(j>=i){
            a = s.charAt(i);
            b = s.charAt(j);
            if(!Character.isLetterOrDigit(s.charAt(i)))
            {
                i++;
            }
            else if(!Character.isLetterOrDigit(s.charAt(j)))
            {
                j--;
            }
            else
            {
                if(Character.toLowerCase(a) != Character.toLowerCase(b))
                    return false;
                else{
                    i++;
                    j--;
                }
            }

        }
        return true;
    }

    public static void main(String[] args) {
        String test = "A man, a plan, a canal: Panama";
        if (isPalindrome(test)) {
            System.out.println("Is palindrome");
        }else
        {
            System.out.println("Not palindrome");
        }
    }
}