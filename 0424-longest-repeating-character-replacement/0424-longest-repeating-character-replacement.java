class Solution {
    public int characterReplacement(String s, int k) {
        
        int l=0;
        int i=0;
        int max=0;
        int freq = 0;
        int[] map = new int[26];
        char[] c = s.toCharArray();

        while(i<c.length)
        {
            map[c[i] -'A']++;
            freq = Math.max(freq,map[c[i] -'A']);

            while(i-l+1 - freq > k)
            {
                map[c[l] -'A']--;
                freq = 0;
                for(int j =0;j<26;j++)
                {
                    freq = Math.max(freq , map[j]);
                }
                l++;
            }
            max = Math.max(i-l+1 , max);
            i++;
        }

        return max;
    }
}