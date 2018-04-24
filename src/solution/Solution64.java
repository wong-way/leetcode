package solution;

/**
 * Created by DELL on 2017-07-08.
 */
public class Solution64 {
    //错误解答
    public int minPathSum(int[][] grid) {
        int i = 0;//记录列
        int j = 0;//记录行
        int width = grid[0].length;
        int height = grid.length;
        int right;
        int down;
        int sum = grid[0][0];
        while (i + 1 <= width && j + 1 <= height) {
            if (i + 1 < width)
                right = grid[j][i + 1];
            else
                right = -1;
            if (j + 1 < height)
                down = grid[j + 1][i];
            else
                down = -1;
            if (down == -1 && right == -1)
                break;
            else if (down == -1) {
                System.out.println("go right :" + right);
                sum += right;
                i++;
            } else if (right == -1) {
                System.out.println("go down :" + down);
                sum += down;
                j++;
            } else {//右边，下边都有值，判断往左走还是往右走
                int tempRight = 0;
                int tempDown = 0;
                // 如果往右走,需要对右边节点进行判断是否越界

                if (i + 2 < width)
                    tempRight = Math.min(right + grid[j][i + 2], right + grid[j + 1][i + 1]);
                else
                    tempRight = right + grid[j + 1][i + 1];

                //如果往下走，只需要检查下边界是否越界
                if (j + 2 < height)
                    tempDown = Math.min(down + grid[j + 2][i], down + grid[j + 1][i + 1]);
                else
                    tempDown = down + grid[j + 1][i + 1];


                //比较优势 int res = down + Math.min(1, 2);
                if (tempDown >= tempRight) {
                    System.out.println("go right :" + right);
                    sum += right;
                    i++;
                } else {
                    System.out.println("go down :" + down);
                    sum += down;
                    j++;
                }
            }
            System.out.println(sum);

        }
        return sum;

    }

    public int minPathSum2(int[][] grid) {
        int i = 0;//记录行
        int j = 0;//记录列
        int width = grid[0].length;
        int height = grid.length;
        int len = width * height;
        int count = 1;
        while (count < len) {
            i = count / width;
            j = count % width;
            if (i - 1 < 0) {
                grid[i][j] = grid[i][j]+grid[i][j - 1];
            } else if (j - 1 < 0) {
                grid[i][j] = grid[i][j]+grid[i - 1][j];
            } else {
                grid[i][j] = grid[i][j]+Math.min(grid[i - 1][j], grid[i][j - 1]);
            }

            count++;
        }

        return grid[height-1][width-1];
    }
    public int minPathSum3(int[][] grid) {
        return getMinSum(grid, 0, 0, new int[grid.length][grid[0].length]);
    }

    public int getMinSum(int[][] grid, int row, int col, int[][] memo) {
        if(row == grid.length - 1 && col == grid[0].length - 1) return grid[row][col];
        if(row >= grid.length || col >= grid[0].length) return Integer.MAX_VALUE;

        if(memo[row][col] <= 0) {
            memo[row][col] = Math.min(getMinSum(grid, row + 1, col, memo),
                    getMinSum(grid, row, col + 1, memo)) + grid[row][col];
        }
        return memo[row][col];
    }
    public static void main(String[] args) {
        Solution64 solution = new Solution64();
        int[][] input = new int[][]{
                {1, 4, 8, 6, 2, 2, 1, 7}, {4, 7, 3, 1, 4, 5, 5, 1}, {8, 8, 2, 1, 1, 8, 0, 1}, {8, 9, 2, 9, 8, 0, 8, 9}, {5, 7, 5, 7, 1, 8, 5, 5}, {7, 0, 9, 4, 5, 6, 5, 6}, {4, 9, 9, 7, 9, 1, 9, 0}
        };
        System.out.println(solution.minPathSum2(input));

    }
}
