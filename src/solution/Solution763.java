package solution;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by DELL on 2018-06-09.
 */
public class Solution763 {
    public List<Integer> partitionLabels(String S) {
        List<Integer> result = new ArrayList<>();
        int start = 0;
        int end = 0;
        for (int i = 0; i < S.length(); i++) {

            for (int j = S.length() - 1; j > i; j--) {
                if (S.charAt(j) == S.charAt(i)) {
                    if (j > end) {
                        end = j;
                    }
                    break;
                }
            }
            if (i == end) {
                result.add(end - start + 1);
                start = i + 1;
                end = i + 1;
            }
        }
        return result;

    }
    public List<Integer> partitionLabels1(String S) {
        if(S == null || S.length() == 0){
            return null;
        }
        List<Integer> list = new ArrayList<>();
        int[] map = new int[26];  // record the last index of the each char

        for(int i = 0; i < S.length(); i++){
            map[S.charAt(i)-'a'] = i;
        }
        // record the end index of the current sub string
        int last = 0;
        int start = 0;
        for(int i = 0; i < S.length(); i++){
            last = Math.max(last, map[S.charAt(i)-'a']);
            if(last == i){
                list.add(last - start + 1);
                start = last + 1;
            }
        }
        return list;
    }

    public static void main(String[] args) {
        String S = "ababcbacadefegdehijhklij";
        Solution763 solution = new Solution763();
        System.out.println(solution.partitionLabels(S));
    }
}
