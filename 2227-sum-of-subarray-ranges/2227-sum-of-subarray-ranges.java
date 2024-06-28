public class Pair{
    long key,value;

    Pair(long key , long value)
    {
        this.key = key;
        this.value = value;
    }

    public long getKey(){
    return this.key;
    }

    public long getValue(){
    return this.value;
    }
}

class Solution {

    public long subArrayRanges(int[] nums) {

        Stack<Pair> st = new Stack<>();
        Stack<Pair> st2 = new Stack<>();

        long[] left = new long[nums.length];
        long[] right = new long[nums.length];



        for(int i=0;i< nums.length;i++)
        {
            int c =1;
            while(!st.isEmpty() && st.peek().getKey() > nums[i])
            {
                c+=st.pop().getValue();
            }
            st.push(new Pair(nums[i] , c));
            left[i] = c;
        }

        for(int i = nums.length-1;i>=0;i--)
        {
            int c = 1;
            while(!st2.isEmpty() && st2.peek().getKey() >= nums[i])
            {
                c+=st2.pop().getValue();

            }
            st2.push(new Pair(nums[i] , c));
            right[i] = c;
        }
            // for(int i:right)
            // System.out.println(i);

            long sm = 0;

        for(int i =0;i<nums.length;i++)
        {
            sm+=left[i]*right[i]*nums[i];
        }
        System.out.println(sm);

         Stack<Pair> st3 = new Stack<>();
         Stack<Pair> st4 = new Stack<>();

           for(int i=0;i< nums.length;i++)
        {
            int c =1;
            while(!st3.isEmpty() && st3.peek().getKey() <= nums[i])
            {
                c+=st3.pop().getValue();
            }
            st3.push(new Pair(nums[i] , c));
            left[i] = c;
        }

        for(int i = nums.length-1;i>=0;i--)
        {
            int c = 1;
            while(!st4.isEmpty() && st4.peek().getKey() < nums[i])
            {
                c+=st4.pop().getValue();

            }
            st4.push(new Pair(nums[i] , c));
            right[i] = c;
        }
            // for(int i:right)
            // System.out.println(i);

            long sma = 0;

        for(int i =0;i<nums.length;i++)
        {
            sma+=left[i]*right[i]*nums[i];
        }
        System.out.println(sma);


      return (long)(sma-sm);
        
    }
}