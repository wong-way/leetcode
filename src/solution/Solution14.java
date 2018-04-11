package solution;

import java.util.Arrays;

/**
 * Created by DELL on 2017-07-04.
 */
public class Solution14 {
    public static String longestCommonPrefix(String[] strs) {
        String result = "";
        if (strs.length == 0)
            return result;
        int index = -1;
        int count = Integer.MAX_VALUE;
        for (String str : strs) {
            if (str.length() < count)
                count = str.length();
        }
        for (int i = 0; i < count; i++) {
            char ch = strs[0].charAt(i);
            boolean isEqual = true;
            for (String str : strs) {
                if (str.charAt(i) != ch) {
                    isEqual = false;
                }
            }
            if (isEqual) {
                index = i;
            } else
                break;
        }
        if (index != -1)
            result = strs[0].substring(0, index + 1);
        return result;
    }

    public static String longestCommonPrefix1(String[] strs) {
        String result = "";
        if (strs.length == 0)
            return result;
        int index = -1;

        Arrays.sort(strs);
        int count = strs[0].length();
        for (int i = 0; i < count; i++) {
            char ch = strs[0].charAt(i);
            boolean isEqual = true;
            for (String str : strs) {
                if (str.charAt(i) != ch) {
                    isEqual = false;
                }
            }
            if (isEqual) {
                index = i;
            } else
                break;
        }
        if (index != -1)
            result = strs[0].substring(0, index + 1);
        return result;
    }

    public static String longestCommonPrefix2(String[] strs) {
        String result = "";
        int index = -1;

        if (strs != null && strs.length > 0) {

            Arrays.sort(strs);

            String firstStr = strs[0];
            String lastStr = strs[strs.length - 1];

            for (int i = 0; i < firstStr.length(); i++) {
                if (firstStr.charAt(i) == lastStr.charAt(i)) {
                    index = i;
                } else {
                    return result;
                }
                result = firstStr.substring(0, index + 1);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        //String [] strs ={"asd","asfd","asdfs"};
        String[] strs = {"aca", "aba"};
        String str = longestCommonPrefix2(strs);
        System.out.println(str);


    }
}
