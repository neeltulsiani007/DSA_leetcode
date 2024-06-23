class Solution {
     public static void generate(int[] candidates , int sum ,List<List<Integer>> l, ArrayList<Integer> temp , int start , int n )
    {
        if(sum<0 || start>candidates.length)
        return;

        if(start == candidates.length){
        if(sum == 0)
        {
            if(temp.size() == n)
            l.add(new ArrayList<>(temp));
        }
         return;
        }
   
        
            temp.add(candidates[start]);
            generate(candidates , sum-candidates[start] , l ,temp , start+1,n);
            temp.remove(temp.size()-1);
            generate(candidates , sum , l ,temp , start+1,n);
            return;


    }
    public List<List<Integer>> combinationSum3(int n, int target) {
        List<List<Integer>> l = new ArrayList<>();
        int[] candidates = new int[]{1,2,3,4,5,6,7,8,9};
        generate(candidates , target , l , new ArrayList<>() , 0,n);
        return l;
    }
}