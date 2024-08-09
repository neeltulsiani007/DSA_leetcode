class Solution {
    public int[][] insert(int[][] intervals, int[] ni) {
       

       List<int[]> l = new ArrayList<>();
        int i =0;
        int n = intervals.length;
        int min = ni[0];
        int max = ni[1];

        while(i<n && ni[0] > intervals[i][1])
        {
            l.add(intervals[i]);
            i++;
        }

        while(i<n && intervals[i][0] <= ni[1])
        {
            min = Math.min(min,intervals[i][0]);
            max = Math.max(max,intervals[i][1]);
            i++;
        }
        l.add(new int[]{min,max});

        while(i<n)
        {
            l.add(intervals[i]);
            i++;
        }

        return l.toArray(new int[l.size()][]);

    }
}