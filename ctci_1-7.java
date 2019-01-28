import java.util.*;

public class MyClass {
    public static int[][] matrixRotate(int[][] mat)
    {
    for(int i=0;i<mat.length/2;i++)
    {
        for(int j=0;j<mat[0].length-i-1;j++)
        {
            int temp = mat[i][j];
            mat[i][j] = mat[mat.length-j-1][i];
            mat[mat.length-j-1][i] = mat[mat.length-i-1][mat.length-j-1];
            mat[mat.length-i-1][mat.length-j-1] = mat[j][mat.length-i-1];
            mat[j][mat.length-i-1] = temp;
        }
    }
    return mat;
 
} 
    
    public static void main(String args[]) {
        int mat[][] = { { 1, 2, 3}, 
                        { 4, 0, 6}, 
                        { 7, 8, 9} };
        int[][] out = matrixRotate(mat);
        
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[0].length;j++)
            {
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
        
    }
}
