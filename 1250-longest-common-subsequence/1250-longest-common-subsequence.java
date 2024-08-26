class Solution {

    public int ans(int m , int n , int[][] memo ,String s1 , String s2)
    {
        if(m == 0 || n == 0)
        return 0;

        if(memo[m][n] != -1)
        {
            return memo[m][n];
        }
        else{
        if(s1.charAt(m-1) == s2.charAt(n-1))
        memo[m][n] = 1 + ans(m-1,n-1 , memo , s1,s2);
        else 
        memo[m][n] = Math.max(ans(m-1,n , memo , s1,s2) , ans(m,n-1 , memo , s1,s2));

        return memo[m][n];
        }

    }

    public int longestCommonSubsequence(String text1, String text2) {
        
        int[][] memo = new int[text1.length()+1][text2.length()+1];

         for(int i = 0;i<memo.length;i++)
        {
            for(int j = 0 ; j<memo[i].length;j++)
            {
            memo[i][j] = -1;
            }
        }

        return ans(text1.length() , text2.length() , memo , text1 , text2);

    }
}