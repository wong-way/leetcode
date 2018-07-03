package solution;

public class Solution695 {


    public int maxAreaOfIsland(int[][] grid) {
        int max = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    max = Math.max(max, helper(grid, i, j));
                }
            }
        }
        return max;
    }

    private int helper(int[][] grid, int i, int j) {
        System.out.println("i = " + i + "j= " + j);
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == 0)
            return 0;
        int area = 1;
        grid[i][j] = 0;
        area += helper(grid, i + 1, j) + helper(grid, i, j + 1) + helper(grid, i - 1, j) + helper(grid, i, j - 1);
        return area;
    }


    public static void main(String[] args) {
        Solution695 solution695 = new Solution695();
        int grid[][]={{1,1,0,0,0},{1,1,0,0,0},{0,0,0,1,1},{0,0,0,1,1}};
        solution695.maxAreaOfIsland(grid);
    }
}
