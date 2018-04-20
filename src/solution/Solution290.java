package solution;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.StringTokenizer;

/**
 * Created by DELL on 2018-04-20.
 */
public class Solution290 {

    public boolean wordPattern(String pattern, String str) {
        String[] token = str.split(" ");
        int len = token.length;
        if (len != pattern.length()) return false;
        Map dict = new HashMap();

        for (int i = 0; i <len ; i++) {
            String word = token[i];
            if (!dict.containsKey(pattern.charAt(i))) {
                if(!dict.containsValue(word))
                    dict.put(pattern.charAt(i), word);
                else
                    return false;
            } else if (!dict.get( pattern.charAt(i)).equals(word)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Solution290 solution = new Solution290();
        if ( solution.wordPattern("aaaa", "dog cat cat dog")) {
            System.out.println("match");

        }
    }
}
