class Solution {
    public int lengthOfLongestSubstring(String t) {
        int[] arr = new int[256];
        int l =0;
        int r = 0;
        int max = 0;
        int currmax = 0;
        Arrays.fill(arr,-1);
        char[] s = t.toCharArray();

        for(r = 0;r<s.length;r++)
        {
            
            if(arr[s[r]] != -1)
            {
                if(arr[s[r]] >= l)
                l = arr[s[r]]+1;
            }
            arr[s[r]] = r;
            max = Math.max(max , r-l+1);
        }
        return max;
    }
}