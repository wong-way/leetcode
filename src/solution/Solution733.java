package solution;

public class Solution733 {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        if (image[sr][sc] == newColor) return image;
        fill(image,sr,sc,image[sr][sc],newColor);
        return image;
    }
    private void fill(int[][]image,int sr,int sc,int rawColor,int newColor){
        int rows = image.length;
        int cols = image[0].length;
        if(sr<0||sr>=rows||sc<0||sc>=cols||rawColor!=image[sr][sc]) return ;
        image[sr][sc] = newColor;
        fill(image,sr+1,sc,rawColor,newColor);
        fill(image,sr-1,sc,rawColor,newColor);
        fill(image,sr,sc+1,rawColor,newColor);
        fill(image,sr,sc-1,rawColor,newColor);
    }
}
