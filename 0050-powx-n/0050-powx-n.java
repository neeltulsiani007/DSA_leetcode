class Solution {

    public double ans(double x , long n)
    {
       if(n == 0)
       return 1;

       if(n%2 == 0)
       {
            return ans(x*x , n/2);
       }
       else
       {
            return x*ans(x , n-1);
       }
    }
    public double myPow(double x, int n) {


        if(n < 0)
        return ans(1/x , Math.abs((long)n));


        return ans(x , Math.abs((long)n));
    }
}