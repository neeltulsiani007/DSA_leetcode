class Solution {

    public static List<String> generate(char[] ch , int n,int opened ,int closed ,List<String> l)
    {
        if(opened == 0 && closed == 0)
        {
            String s = new String(ch);
            l.add(s);
            return l ;
        }

        if(opened != 0)
        {
            ch[n] = '(';
            generate(ch , n+1 , opened-1 , closed , l);
        }
        if(closed > opened)
        {
            ch[n] = ')';
            generate(ch , n+1 , opened , closed-1 , l);
        }
        return l;
       
    }

    public List<String> generateParenthesis(int n) {
        
        List<String> l = new ArrayList<>();
        char[] ch = new char[2*n];
        return generate(ch , 0 , n, n , l);
    }
}