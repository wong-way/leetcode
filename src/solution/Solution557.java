package solution;

import java.util.Arrays;

/**
 * Created by DELL on 2018-06-12.
 */
public class Solution557 {
    public String reverseWords(String s) {

        String[] words = s.split(" ");
        String res = "";
        for (String word:
             words) {
            res+=reverseWord(word);

            res+=" ";
        }
        return res.substring(0,res.length()-1);
    }
    public String reverseWord(String s){
        String result = "";
        for(int i = s.length()-1;i>=0;i--){
            result += s.charAt(i);
        }

        return result;

    }
    public String reverseWords1(String s) {
        char[] arr = s.toCharArray();
        int i=0,j=0;
        while(j < arr.length) {
            if(arr[j] == ' ') {
                reverse1(arr, i, j-1);
                j++;
                i=j;
            } else
                j++;
        }
        reverse1(arr, i , j-1);
        s = new String(arr);
        return s;
    }

    void reverse1(char[] arr, int i, int j) {
        while(i<j) {
            char tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        Solution557 solution = new Solution557();
        System.out.println(solution.reverseWords("Let's take LeetCode contest"));

    }
}
