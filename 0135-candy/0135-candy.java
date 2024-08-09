class Solution {
    public int candy(int[] ratings) {
        
        int sum = 1;
        int i = 1;
        int n = ratings.length;


        while(i<ratings.length)
        {

            if(ratings[i] == ratings[i-1])
            {
                sum+=1;
                i++;
                continue;
            }
            int count=1;

            while(i<n && ratings[i] > ratings[i-1])
            {
                  count++;
                sum+=count;
                i++;
            }
            int dcount=1;
             while(i<n && ratings[i] < ratings[i-1])
            {
                sum+=dcount;
                i++;
                dcount++;
                
            }
            if(dcount > count)
            sum+=(dcount-count);
        }   
        return sum;
    }
}