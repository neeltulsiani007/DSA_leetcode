class Solution {

    public int ans(char[] c , int i , int n , int sign , long fin)
    {
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;

        if(i == n)
        {
           if(fin*sign > max)
           return max;
           else if(fin*sign < min)
           return min;
           else
           return (int)fin*sign;
        }
        if(c[i] == '-' && i == 0)
        {
            sign = -1;
            return ans(c , i+1 , n , sign , fin);
        }
        else if(c[i] == '-' && i != 0)
        {
            return (int)fin*sign;
        }
        if(c[i] == '+' && i == 0)
        {
            sign = 1;
            return ans(c , i+1 , n , sign , fin);
        }
        else if(c[i] == '+' && i != 0)
        {
            return (int)fin*sign;
        }
        
        else if(c[i] == '0')
        {
            if(fin == 0)
            return ans(c , i+1 , n , sign , fin);
            else {
                fin = fin*10 + Character.getNumericValue(c[i]);
                if(fin*sign > max)
                return max;
                else if(fin*sign < min)
                return min;
                else
                return ans(c , i+1 , n , sign , fin);
            }
        }
        else if(c[i] == '1' || c[i] == '2' || c[i] == '3' || c[i] == '4' || c[i] == '5' || c[i] == '6' || c[i] == '7' || c[i] == '8' || c[i] == '9')
        {
                fin = fin*10 + Character.getNumericValue(c[i]);
                System.out.println(fin*sign);
                if(fin*sign > max)
                return max;
                else if(fin*sign < min){
                return min;
                }
                else
                return ans(c , i+1 , n , sign , fin);
        }
        else
        {
           if(fin*sign > max)
           return max;
           else if(fin*sign < min)
           return min;
           else
           return (int)fin*sign;
        }
    }
    public int myAtoi(String s) {
        s = s.trim();
        if(s.isEmpty())
        {
            return 0;
        }
        return ans(s.toCharArray() , 0 , s.length(),1,0);
    }
}