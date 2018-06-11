package solution;

/**
 * Created by DELL on 2018-06-11.
 */
public class Solution791 {
    public String customSortString(String S, String T) {
        char[] arr = S.toCharArray();
        String result = "";
        for (char ch :
                arr) {
            for (int i = 0; i < T.length(); i++) {
                if(T.charAt(i)==ch)result += ch;
            }

        }
        for (int i = 0; i < T.length(); i++) {
            if (S.indexOf(T.charAt(i))==-1) {
                result += T.charAt(i);
            }
        }
        return result;
    }

}
