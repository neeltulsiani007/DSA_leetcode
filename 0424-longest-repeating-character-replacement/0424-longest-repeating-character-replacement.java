class Solution {
    public int characterReplacement(String s, int k) {
        
        int[] hash = new int[26];
        int max = 0;
        int i = 0;
        int l = 0;
        int freq = 0;

        while(i<s.length())
        {
            hash[s.charAt(i) - 'A']++;

            freq = Math.max(freq , hash[s.charAt(i) - 'A']);

            while(i-l+1 - freq > k)
            {
                hash[s.charAt(l) - 'A']--;
                freq = 0;
                for(int t : hash)
                freq = Math.max(freq , t);

                 l++;
            }

            max = Math.max(i-l+1 , max);
            i++;
        }
        return max;
    }
}