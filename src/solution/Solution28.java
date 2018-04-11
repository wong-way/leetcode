package solution;

/**
 * Created by DELL on 2017-07-07.
 */
public class Solution28
{
    public static int strStr(String haystack, String needle) {
        if (needle.length() == 0)
            return 0;
        if (haystack.length() == 0)
            return -1;
        for (int i = 0; i < haystack.length() + 1; i++) {
            for (int j = 0; j < needle.length() + 1; j++) {

                if (j == needle.length())
                    return i;
                if (i + j == haystack.length())
                    return -1;
                if (haystack.charAt(i + j) != needle.charAt(j))
                    break;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        String haystack = "asdfasd";
        String needle = "fas";
        int result = strStr(haystack,needle);
        System.out.println(result);
    }
}
