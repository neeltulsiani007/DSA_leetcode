class Solution {
    public long pow(long x , long n)
    {
        long m = 1000000000 + 7;
        if(n == 0)
        return 1;
        if(n%2 == 0)
        return pow((x*x)%m , n/2);
        else
        return (x*pow(x , n-1))%m;

    }
    public int countGoodNumbers(long n) {
        long m = 1000000000 + 7;
        long ans =  (pow(5,(n/2 + n%2))*pow(4 ,n/2))%m;
        return (int)ans;
    }
}