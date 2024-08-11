class Solution {
    public int divide(int dividend, int divisor) {
         if(dividend == divisor)
        return 1;

        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE; 
        }

        int sign = 1;

        if((dividend > 0) ^ (divisor > 0))
         sign = -1;

         long d = Math.abs((long)divisor);
         long n = Math.abs((long)dividend);

         long quotient = 0;

         while(n >= d)
         {
            int count = 0;

            while(n > (d << (count+1)))
            count++;

            quotient += (1 << count);
            n -= (d << count);
         }


        return (int)(sign * quotient);
    }
}