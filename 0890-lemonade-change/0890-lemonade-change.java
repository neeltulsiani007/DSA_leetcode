class Solution {


    int fc = 0;
    int tc = 0;

    public boolean lemonadeChange(int[] bills) {
        for(int i : bills)
        {
            if(i == 5){
            fc++;
            continue;
            }

            if(i == 10)
            {
                if(fc == 0)
                return false;
                else
                {
                    fc--;
                    tc++;
                }
                continue;
            }
            if(i == 20)
            {
                if(tc == 0)
                {
                    if(fc < 3)
                    return false;
                    else
                    fc-=3;
                }
                else
                {
                    tc-=1;
                    if(fc == 0)
                    return false;
                    else
                    fc-=1;
                }
            }
        }
        return true;
    }
}