class Solution {
    public int minBitFlips(int start, int goal) {

        int count = 0;

        int ne = start ^ goal;

        while(ne > 0)
        {
           if((ne & 1) != 0)
           count++;

           ne = (ne >> 1);
        }
        
        return count;
    }
}