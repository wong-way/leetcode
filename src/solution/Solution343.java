package solution;

/**
 * Created by DELL on 2018-05-12.
 */
public class Solution343 {

    //dfs
    public int integerBreak(int n) {
        int max = 0;
        if(n == 2 )
            return 1;
        for(int i = 1;i<n-1;i++){
            int t1 =  i*integerBreak(n-i);
            int t2 = i*(n-i);
            int temp = t1>t2?t1:t2;
            if(temp>max) max = temp;
        }
        return max ;
    }
    //记忆化 dfs
    private int[] arr = new int[56];
    public int integerBreak1(int n) {
        int max = 0;
        if(n == 2 )
            return 1;
        for(int i = 1;i<n-1;i++){
            if(arr[n-i] ==0){
                arr[n - i] = integerBreak(n - i);
            }
            int t1 =  i*arr[n - i];
            int t2 = i*(n-i);
            int temp = t1>t2?t1:t2;
            if(temp>max) max = temp;
        }
        return max ;
    }
}
