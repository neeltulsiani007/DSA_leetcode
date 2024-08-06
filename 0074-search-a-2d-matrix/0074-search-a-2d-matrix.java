class Solution {


    public boolean searchMatrix(int[][] arr, int target) {
        
        int start = 0;
        int m  = arr.length;
        int n = arr[0].length;
        int end = arr.length*arr[0].length-1;

        while(start <= end)
        {
            int mid = (start+end)/2;
            if(arr[mid/n][mid%n] == target)
            return true;
            else if(arr[mid/n][mid%n] > target)
            end = mid-1;
            else
            start = mid+1;
        }

        return false;
    }
}