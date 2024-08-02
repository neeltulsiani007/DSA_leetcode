class Solution {
     public void dfs(ArrayList<ArrayList<Integer>> l ,int s ,boolean[] visited)
    {
        visited[s] = true;
        for(int i = 0;i<l.get(s).size();i++)
        {
             if(visited[l.get(s).get(i)]==false)
            dfs(l, l.get(s).get(i),visited);
        }
        
    }

    public int findCircleNum(int[][] arr) {
        
            ArrayList<ArrayList<Integer>> l = new ArrayList<>();
            int count = 0;
            boolean[] visited = new boolean[arr.length];
            for(int i = 0;i<arr.length;i++)
            {
                l.add(new ArrayList<Integer>());
            }

            for(int i =0;i<arr.length;i++)
            {
                for(int j =0;j<arr.length;j++)
                {
                    if(arr[i][j] == 1)
                    {
                        l.get(i).add(j);
                        l.get(j).add(i);
                    }
                }
            }

            for(int i =0;i<arr.length;i++)
            {
                if(visited[i] == false)
                {
                    count++;
                    dfs(l,i,visited);
                }
            }

            return count;

    }
}