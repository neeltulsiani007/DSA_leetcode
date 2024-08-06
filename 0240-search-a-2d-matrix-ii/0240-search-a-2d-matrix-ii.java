
class Solution {


    public boolean searchMatrix(int[][] arr, int target) {
        int m = arr.length;
        int n = arr[0].length;

        int row = 0;
        int col = n-1;

        while(row < m && col >= 0)
        {
            if(arr[row][col] == target)
            return true;
            else if(arr[row][col] > target)
            {
                col--;
            }
            else
            {
                row++;
            }
        }

        return false;
    }
}