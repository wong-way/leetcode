package solution;

/**
 * Created by DELL on 2017-07-02.
 */
public class Solution338 {
    public int[] countBits(int num) {
        int bits[] = new int[num + 1];
        int flag = 0;
        for (int i = 1; i <= num; i++) {
            if ((i & i - 1) == 0) {
                bits[i] = 1;
                flag = i;
            } else {
                bits[i] = bits[flag] + bits[i - flag];
            }
        }
        return bits;
    }
    public int[] countBits1(int num) {

        int[] res = new int[num+1];

        for(int i=1;i<num+1;i++)
            res[i] = res[i/2] + (i&1);

        return res;

    }
    public int[] countBits2(int num){
        int[] f = new int[num + 1];
        for (int i=1; i<=num; i++) f[i] = f[i >> 1] + (i & 1);
        return f;
    }

    public static void main(String[] args) {
        Solution338 solution = new Solution338();
        int[] result = solution.countBits(31);
        for (int x : result) {
            System.out.println(x);

        }
    }
}
