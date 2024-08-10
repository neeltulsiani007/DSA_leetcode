class Solution {
    public int numberOfSubstrings(String s) {
        int[] l = new int[3];
        Arrays.fill(l , -1);
        int t = 0;
        int i =0;
        int count = 0;

        while(i<s.length())
        {
            l[s.charAt(i) - 'a'] = i;

            if(l[0] != -1 && l[1] != -1 && l[2] != -1)
            {
                int ind = Math.min(l[0] , Math.min(l[1] , l[2]));

                count+=ind+1;  
                     
            }
            i++;
        }

        return count;
    }
}