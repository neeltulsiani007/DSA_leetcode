class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int c = 0;
        int t = 0;

        for(int i = 0;i<g.length;i++)
        {
            if(t == s.length)
            break;

            if(g[i] <= s[t])
            {
                c++;
                t++;
            }
            else{
            t++;
            i--;
            }
        }
        return c;
    }
}