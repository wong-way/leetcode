package solution;

/**
 * Created by DELL on 2018-05-07.
 */
public class Solution461 {
    public int hammingDistance(int x, int y) {
        int result = x^y;
        int count=0;
        for (int i = 0; i < 32; i++) {
            count+= result&1;
            result>>=1;
        }
        return count;
    }
}
