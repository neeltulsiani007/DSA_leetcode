class Solution {
    public int countPrimes(int n) {
        int[] p = new int[n];

        if(n<=2)
        return 0;
 

        for(int i = 2;i<n;i++)
        {
            p[i]= 1;
        }



        for(int i = 2; i*i<n;i++)
        {
            if(p[i] == 1)
            {
                for(int j = i*i;j<n;j+=i)
                {
                    p[j] = 0;
                }
            }
        }

        int sum = 0;

        for(int i : p)
        sum+=i;
        return sum;
    }
}