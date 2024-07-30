class Solution {
    public boolean compare(String s1, String s2) {
        if (s1.length() != s2.length() + 1) {
            return false;
        }
       

        int first = 0;
        int second = 0;

        while (first < s1.length()) {
            if (second < s2.length() && s1.charAt(first) == s2.charAt(second)) {
                first++;
                second++;
            } else {
                first++;
            }
        }

        return first == s1.length() && second == s2.length();
    }
    public int longestStrChain(String[] words) {
 if(words.length == 1)
        return 1;
        Arrays.sort(words , (s1, s2) -> s1.length() - s2.length());
        int[] dp = new int[words.length];
        int max = 0;
        dp[0] = 1;
        
        for(int i =1;i<words.length;i++)
        {
            dp[i] = 1;
            for(int j =0;j<i;j++)
            {
                if(compare(words[i] , words[j]) && (1+dp[j] > dp[i]))
                {
                    dp[i] = dp[j]+1;
                }
            }
            max = Math.max(max , dp[i]);
        }
        return max;
    }
}