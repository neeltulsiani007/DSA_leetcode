class Solution {
    public void swap(int[][] matrix , int i , int j)
    {
        int temp = matrix[i][j];
        matrix[i][j] = matrix[j][i];
        matrix[j][i] = temp;
    }

    public void reverse(int[][] matrix , int i)
    {
        for(int j = 0;j<matrix[0].length/2;j++)
        {
            int temp = matrix[i][j];
            matrix[i][j] = matrix[i][matrix[0].length - j -1];
            matrix[i][matrix[0].length - j -1] = temp;
        }

    }

    public void rotate(int[][] matrix) {
        
        for(int i =0;i<matrix.length-1;i++)
        {
            for(int j = i+1;j<matrix[0].length;j++)
            {
                swap(matrix , i ,j);
        }
        }

        for(int i =0;i<matrix.length;i++)
        {
            reverse(matrix , i);
        }

    }
}