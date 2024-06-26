class Solution {
    public List<List<Integer>> generate(int r) {
        
        List<List<Integer>> l = new ArrayList<List<Integer>>();
        ArrayList<Integer> temp = new ArrayList<>();
        temp.add(1);
        l.add(temp);
        if(r == 1)
        return l;
        ArrayList<Integer> temp2 = new ArrayList<>();
        temp2.add(1);
        temp2.add(1);
        l.add(temp2);
        if(r == 2)
        return l;

        for(int i = 3;i<=r;i++)
        {

            int ans = 1;
            ArrayList<Integer> t = new ArrayList<>();
            t.add(ans);
            for(int j = 1;j<i;j++)
            {
                ans = ans*(i-j);
                ans = ans/j;
                t.add(ans);
            }
            l.add(t);
        }

        return l;
    }
}