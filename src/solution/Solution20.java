package solution;

import java.util.Stack;

/**
 * Created by DELL on 2017-07-04.
 */
public class Solution20 {
    private static final int PARENTHESIS = 1;
    private static final int BEACKET = 2 ;
    private static final int BRACE = 3;
    public static boolean isValid(String s) {
        Stack<Integer> mStack = new Stack<Integer>();
        boolean isValid = true;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                mStack.push(PARENTHESIS);
            } else if (s.charAt(i) == '[') {
                mStack.push(BEACKET);
            } else if (s.charAt(i) == '{') {
                mStack.push(BRACE);
            } else if (s.charAt(i) == ')') {
                if(mStack.isEmpty())
                {
                    isValid = false;
                    break;
                }
                if (mStack.pop().equals(PARENTHESIS))
                    continue;
                else {
                    isValid = false;
                    break;
                }
            } else if (s.charAt(i) == ']') {
                if(mStack.isEmpty())
                {
                    isValid = false;
                    break;
                }
                if (mStack.pop().equals(BEACKET))
                    continue;
                else {
                    isValid = false;
                    break;
                }
            } else if (s.charAt(i) == '}') {
                if(mStack.isEmpty())
                {
                    isValid = false;
                    break;
                }
                if (mStack.pop().equals(BRACE))
                    continue;
                else {
                    isValid = false;
                    break;
                }
            }
        }
        if (!mStack.isEmpty())
            isValid = false;
        return isValid;

    }

    public static void main(String[] args) {
        String testStr = "()(){[]()}";
        if (isValid(testStr)) {
            System.out.println("valid");
        } else {
            System.out.println("invalid");
        }
    }
}
