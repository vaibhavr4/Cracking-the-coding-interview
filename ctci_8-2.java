// robot unique paths without obstacles

class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        
        for(int i=0;i<n;i++)
            dp[0][i] = 1;
        for(int j=0;j<m;j++)
            dp[j][0] = 1;
        
        for(int i=1;i<m;i++)
        {
            for(int j=1;j<n;j++)
            {
                dp[i][j] = dp[i-1][j]+dp[i][j-1];
            }
        }
        return dp[m-1][n-1];
    }
}


// robot unique paths with obstacles
class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int R = obstacleGrid.length;
        int C = obstacleGrid[0].length;
        if(obstacleGrid[0][0]==1)
            return 0;
        obstacleGrid[0][0]=1;
        //filling first col (if obstacle fill 0, if no obstacle and prev
        //cell is not 0 then fill 1)
        for(int i=1;i<R;i++)
        {
            obstacleGrid[i][0] = (obstacleGrid[i][0]==0 && obstacleGrid[i-1][0]==1)?1:0;
        }
        
        //filling first row (if obstacle fill 0, if no obstacle and prev
        //cell is not 0 then fill 1)
        for(int j=1;j<C;j++)
        {
            obstacleGrid[0][j] = (obstacleGrid[0][j]==0 && obstacleGrid[0][j-1]==1)?1:0;
        }
        
        for(int i=1;i<R;i++)
        {
            for(int j=1;j<C;j++)
            {
                if(obstacleGrid[i][j]==0)
                {
                    obstacleGrid[i][j] = obstacleGrid[i-1][j]+obstacleGrid[i][j-1]; 
                }
                else
                    obstacleGrid[i][j] = 0;
            }
        }
        return obstacleGrid[R-1][C-1];
    }
}