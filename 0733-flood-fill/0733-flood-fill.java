class Solution {
    public int[][] floodFill(int[][] image, int r, int c, int color) 
    {
        int original = image[r][c];
        if(original==color)
            return image;

        dfs(image,r,c,color,original);

        return image;
        
    }

    private void dfs(int[][] image,int sr,int sc, int color,int original)
    {
        int n = image.length;
        int m = image[0].length;

        if(sr<0 || sr>=n || sc<0 ||sc>=m ||image[sr][sc]!=original)
            return;
        
        image[sr][sc]=color;
        dfs(image,sr-1,sc,color,original);
        dfs(image,sr+1,sc,color,original);
        dfs(image,sr,sc-1,color,original);
        dfs(image,sr,sc+1,color,original);
    }
}