package solution;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by DELL on 2018-06-12.
 */
public class Solution500 {
    public String[] findWords(String[] words) {



        String firstRow = "qwertyuiop";
        String secondRow = "asdfghjkl";
        String thirdRow = "zxcvbnm";
        List<String> result = new LinkedList<>();
        for (String word : words) {
            int index = 0;
            int temp = 0;

            for (int i = 0; i < word.length(); i++) {
                if (firstRow.indexOf( word.toLowerCase().charAt(i)) != -1) {
                    temp = 1;
                } else if (secondRow.indexOf( word.toLowerCase().charAt(i)) != -1) {
                    temp = 2;
                } else {
                    temp = 3;
                }

                if (index == 0)
                    index = temp;
                if (index != 0 && index != temp) {
                    break;
                }

            }
            if (index == temp) {
                result.add(word);
            }
        }
        return  result.toArray(new String [0]);
    }
    private int getRowNum(char ch) {
        String row1 = "qwertyuiopQWERTYUIOP";
        String row2 = "asdfghjklASDFGHJKL";
        String row3 = "zxcvbnmZXCVBNM";

        if (row1.indexOf(ch) >= 0) {
            return 0;
        }

        if (row2.indexOf(ch) >= 0) {
            return 1;
        }

        if (row3.indexOf(ch) >= 0) {
            return 2;
        }

        return -1;
    }

    public String[] findWords1(String[] words) {


        List<String> list = new ArrayList<String>();
        for (int i = 0; i < words.length; i++) {
            char[] tempStr = words[i].toCharArray();
            if (tempStr.length <= 0) {
                continue;
            }
            boolean isResult = true;
            int old = getRowNum(tempStr[0]);
            for (int j = 1; j < tempStr.length; j++) {
                if (old != getRowNum(tempStr[j])) {
                    isResult = false;
                    break;
                }
            }

            if (isResult) {
                list.add(words[i]);
            }
        }

        return list.toArray(new String[list.size()]);
    }

    public static void main(String[] args) {
        String[] str ={"Hello","Alaska","Dad","Peace"};
        Solution500 solution = new Solution500();
        System.out.println(Arrays.toString(solution.findWords(str)));
    }
}
