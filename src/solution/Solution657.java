package solution;

/**
 * Created by DELL on 2018-05-11.
 */
public class Solution657 {
    public boolean judgeCircle(String moves) {
        int horizontal = 0;
        int vertical =0;
        char[] arr = moves.toCharArray();
        for (char ch : arr) {
            if (ch == 'L')
                horizontal++;
            else if(ch=='R')
                horizontal--;
            else if(ch=='D')
                vertical++;
            else if(ch=='U')
                vertical--;
        }
        return vertical==0&&horizontal==0;
    }
}
