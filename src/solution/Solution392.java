package solution;

public class Solution392 {
    public boolean isSubsequence(String s, String t) {
        int index = 0;
        char[] arr = s.toCharArray();
        char[] dict = t.toCharArray();

        for(int i = 0;i<dict.length&&index<arr.length;i++){
            if (arr[index] == dict[i]) {
                index ++;
            }
        }
        return index == arr.length;
    }
}
