class Solution {
    public boolean checkValidString(String st) {
        
        int lp = 0;
        int s = 0;
        int rp = 0;

        for(char c : st.toCharArray())
        {
           // System.out.println(c);
            if(c == '(' )
            {
                lp++;
                continue;
            }
            else if(c == '*')
            {
                s++;
            }
            else if(c == ')')
            {
                if(lp > 0)
                {
                    lp--;
                }
                else if(s>0)
                {
                    s--;
                }
                else
                return false;
            }
        }
        lp = 0;
        s = 0;
          for(int i = st.length()-1;i>=0;i--)
        {
            char c = st.charAt(i);
           // System.out.println(c);
            if(c == ')' )
            {
                lp++;
                continue;
            }
            else if(c == '*')
            {
                s++;
            }
            else if(c == '(')
            {
                if(lp > 0)
                {
                    lp--;
                }
                else if(s>0)
                {
                    s--;
                }
                else
                return false;
            }
        }



        return true;
    }
}