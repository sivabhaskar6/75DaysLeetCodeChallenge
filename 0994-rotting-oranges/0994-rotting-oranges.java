class Solution {
    public int orangesRotting(int[][] grid) 
    {
        int n = grid.length;
        int m = grid[0].length;
        int min=0;
        int fresh=0;
        Queue<int[]> queue = new LinkedList<>();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(grid[i][j]==2)
                {
                    queue.offer(new int[]{i,j});
                }
                if(grid[i][j]==1)
                {
                    fresh++;
                }
            }
        }
        int directions[][] = {{0,1},{0,-1},{-1,0},{1,0}};

        while(!queue.isEmpty() && fresh>0)
        {
            int size = queue.size();

            for(int k =0;k<size;k++)
            {
                int cur[] = queue.poll();
                int i = cur[0];
                int j = cur[1];
                for(int[] dir:directions)
                {
                    int ni = i+dir[0];
                    int nj = j+dir[1];

                    if(ni>=0 && ni<n && nj>=0 && nj<m && grid[ni][nj]==1)
                    {
                        fresh--;
                        grid[ni][nj]=2;
                        queue.offer(new int[]{ni,nj});
                    }
                }
            }
            min++;
        }
        if(fresh>0)
            return -1;

        return min;
    }

   
}