class Solution {
    public int findPeakElement(int[] arr) {
        

        int start = 0;
        int end = arr.length-1;
        
        if(arr.length == 1)
        return 0;

        if(arr.length == 2)
        {
            if(arr[0] > arr[1])
            return 0;
            else
            return 1;
        }

        while(start<end)
        {
            int mid = (start+end)/2;
            if(arr[mid] < arr[mid+1])
            start = mid+1;
            else
            end = mid;
    }
    return start;
}
}