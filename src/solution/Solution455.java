package solution;

import java.util.Arrays;

/**
 * Created by DELL on 2018-04-22.
 */
public class Solution455 {
    public int findContentChildren1(int[] g, int[] s) {
        int count = 0;
        Arrays.sort(s);
        Arrays.sort(g);
        for(int i = 0; count<g.length&&i<s.length;i++){
            if(s[i]>=g[count])
                count++;
        }
        return count;
    }
    public int findContentChildren(int[] g, int[] s) {
        int count = 0;
        Arrays.sort(s);
        Arrays.sort(g);
        for(int i = 0; i<s.length;i++){
            if(count<g.length&&s[i]>=g[count])
                count++;
        }
        return count;
    }
}
