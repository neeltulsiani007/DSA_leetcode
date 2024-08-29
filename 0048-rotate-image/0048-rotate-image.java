class Solution {

    public void reverse(int[] arr , int start , int end)
    {
        while(start < end)
        {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public void rotate(int[][] matrix) {
        
        for(int i =0;i<matrix.length;i++)
        {
            for(int j =i+1; j<matrix[0].length;j++)
            {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for(int i =0;i<matrix.length;i++)
        {
            reverse(matrix[i],0,matrix[0].length-1);
        }
    }
}