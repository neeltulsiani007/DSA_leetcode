class Solution {
    public String removeKdigits(String num, int k) {

        StringBuilder s = new StringBuilder();
        Stack<Character> st = new Stack<>();

        for(char c : num.toCharArray())
        {
            while(!st.isEmpty() && k>0 && st.peek() > c)
            {
                st.pop();
                k--;
            }
            st.push(c);
        }

        while(k!=0 ){
        st.pop();
        k--;
        }

        if(st.isEmpty())
        return "0";

        
        System.out.println(st);
        while(!st.isEmpty())
        s.append(st.pop());

         //System.out.println(s.toString());


        s.reverse();
        while(s.length()>0&&s.charAt(0) == '0')
        {
            s.deleteCharAt(0);
        }
        if(s.length() == 0)
        return "0";
        

        return s.toString();
        
        
    }
}