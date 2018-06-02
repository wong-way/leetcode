package solution;

/**
 * Created by DELL on 2018-06-01.
 */
public class Solution807 {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int[] vertical=new int[grid[0].length];
        int[] horizontal = new int [grid.length];
        for(int i =0;i<grid.length;i++){
            horizontal[i] = -1;
            for(int j = 0;j<grid[0].length;j++){
                if(grid[i][j]>horizontal[i])
                    horizontal[i] = grid[i][j];
                if(grid[j][i]>vertical[i])
                    vertical[i] = grid[j][i];
            }
        }
        // System.out.println(Arrays.toString(vertical));
        // System.out.println(Arrays.toString(horizontal));
        int count=0;
        for(int i =0;i<grid.length;i++){

            for(int j = 0;j<grid[0].length;j++){
                count+=Math.min(horizontal[i],vertical[j])-grid[i][j];

            }
        }


        return count;

    }
}
