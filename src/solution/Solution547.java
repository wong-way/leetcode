package solution;

public class Solution547 {
    public int findCircleNum(int[][] M) {
        int count = 0;
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[0].length; j++) {

                if (M[i][j] == 1) {
                    M[i][j] = 0;
                    if (i == j) {
                        count++;
                    } else {
                        helper(M, j);
                    }
                }
            }
            System.out.println("count = " + count);
        }
        return count;
    }

    /**
     * 将与people同处一个关系网的置位
     *
     * @param grid 关系网
     * @param i    行数
     */
    private void helper(int[][] grid, int i) {

        for (int j = 0; j < grid[i].length; j++) {
            if (grid[i][j] == 1 && i != j) {

                grid[i][j] = 0;
                grid[i][i] = 0;
                helper(grid, j);
            }

        }

    }


    public void dfs(int[][] M, int[] visited, int i) {
        for (int j = 0; j < M.length; j++) {
            if (M[i][j] == 1 && visited[j] == 0) {
                visited[j] = 1;
                dfs(M, visited, j);
            }
        }
    }

    public int findCircleNum1(int[][] M) {
        int[] visited = new int[M.length];
        int count = 0;
        for (int i = 0; i < M.length; i++) {
            if (visited[i] == 0) {
                dfs(M, visited, i);
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[][] grid = {{1, 1, 1}, {1, 1, 1}, {1, 1, 1}};
        Solution547 solution = new Solution547();
        solution.findCircleNum(grid);
    }

}
