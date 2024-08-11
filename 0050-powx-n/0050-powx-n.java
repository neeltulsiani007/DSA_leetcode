class Solution {
    public double myPow(double x, int t1) {

        double ans = 1;
        long t = t1;
        long n = t1;
       
       if(n<0)
       {
        n*=-1;
       }
        
        while(n>0)
        {
            if(n%2 != 0)
            {
                ans*=x;
                n-=1;
            }
            else
            {
                x*=x;
                n=n/2;
            }
        }

        return t < 0 ? 1 / ans : ans;
    }
}