class Solution {
    public boolean isValid(String t) {
        Stack<Character> s = new Stack<>();

        for(char c : t.toCharArray())
        {
            if(c == '(' || c == '[' || c == '{')
            {
                s.push(c);
            }
            else if(c == ')')
            {
                if(s.isEmpty())
                return false;
                if(s.peek() == '(')
                s.pop();
                else
                return false;
            }
            else if(c == '}')
            {
                if(s.isEmpty())
                return false;
                if(s.peek() == '{')
                s.pop();
                else
                return false;
            }
            else if(c == ']')
            {
                if(s.isEmpty())
                return false;
                if(s.peek() == '[')
                s.pop();
                else
                return false;
            }

        }
        if(s.isEmpty())
        return true;
        return false;
    }
}