package solution;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by DELL on 2018-06-02.
 */
public class Solution804 {
    public int uniqueMorseRepresentations(String[] words) {
        String[] dict = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
        Set set = new HashSet();
        for (String str : words) {
            String morseCode = "";
            char[] arr = str.toCharArray();
            for (int i = 0; i < arr.length; i++) {
                morseCode += dict[arr[i] - 'a'];
            }
            set.add(morseCode);
        }
        return set.size();
    }

    public static void main(String[] args) {
        String []words={"gin", "zen", "gig", "msg"};
        Solution804 solution = new Solution804();
        System.out.println(solution.uniqueMorseRepresentations(words));
    }
}
