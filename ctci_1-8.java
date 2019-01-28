class Solution {
    public void setZeroes(int[][] matrix) {
        boolean isCol = false;
        
        for (int i = 0; i < matrix.length; i++) {
          if (matrix[i][0] == 0) {
            isCol = true;
      }
        for (int j = 1; j < matrix[0].length; j++) {
        if (matrix[i][j] == 0) {
          matrix[0][j] = 0;
          matrix[i][0] = 0;
        }
      }
    }
        
        for(int i=1;i<matrix.length;i++)
        {
            for(int j=1;j<matrix[0].length;j++)
            {
                if(matrix[i][0]==0 || matrix[0][j]==0)
                    matrix[i][j]=0;
            }
        }
        if (matrix[0][0] == 0) {
        for (int i = 0; i < matrix[0].length; i++) {
            matrix[0][i] = 0;
        }
        }

        if (isCol) {
          for (int i = 0; i < matrix.length; i++) {
            matrix[i][0] = 0;
          }
    }
        for(int x=0;x<matrix.length;x++)
        {
            for(int y=0;y<matrix[0].length;y++)
            {
                System.out.print(matrix[x][y]+" ");
            }
            System.out.println();
        }
    }
}