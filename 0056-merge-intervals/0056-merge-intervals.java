

class Solution {

    public int[][] merge(int[][] arr) {
        
        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));
        List<int[]> ans = new ArrayList<>();  


        
        int[] curr = arr[0];
        for(int i =1;i<arr.length;i++)
        {

            int[] interval = arr[i];
            if(interval[0] <= curr[1])
            {
                curr[1] = Math.max(curr[1] , interval[1]);
            }
            else
            {
                ans.add(curr);
                curr = interval;
            }
        }

        ans.add(curr);

        return ans.toArray(new int[ans.size()][]);
        
    }
}