package solution;

/**
 * Created by DELL on 2018-04-26.
 */
public class Solution413 {
    public int numberOfArithmeticSlices(int[] A) {
        int len = A.length;
        int count = 0;
        int i = 0;
        while (i < len - 2) {
            count += isArithmetic(A, i);
            i++;
        }
        return count;
    }

    private int isArithmetic(int[] A, int start) {
        int i = 0;
        int count = 0;
        int step = A[start + 1] - A[start];
        if (step != A[start + 2] - A[start + 1]) {
            return 0;
        }
        i = start + 2;
        count = 1;
        while (i < A.length-1 && (A[i + 1] - A[i] == step)) {
            i++;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Solution413 solution = new Solution413();
        int[] arr = new int[]{1,2,3,4};
        System.out.println(solution.numberOfArithmeticSlices(arr));

    }
}
