class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int l = 0;
        int max = 0;
        int ans = 0;
        int[] arr = new int[256];
        Arrays.fill(arr,-1);

        for(int i = 0;i<s.length();i++)
        {
            if(arr[s.charAt(i)] != -1)
            {
                if(arr[s.charAt(i)] >= l)
                {
                    l = arr[s.charAt(i)]+1;
                }
            }
            arr[s.charAt(i)] = i;
            ans = Math.max(ans , i-l+1);
        }

        return ans;
    }
}