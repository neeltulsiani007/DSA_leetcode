class Solution {
    public static void generate(int[] candidates , int sum ,List<List<Integer>> l, ArrayList<Integer> temp , int start )
    {
        if(sum<0 || start>candidates.length)
        return;

        if(start == candidates.length){
        if(sum == 0)
        {
            l.add(new ArrayList<>(temp));
        }
         return;
        }
   
        
            temp.add(candidates[start]);
            generate(candidates , sum-candidates[start] , l ,temp , start);
            temp.remove(temp.size()-1);
            generate(candidates , sum , l ,temp , start+1);
            return;


    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        
        List<List<Integer>> l = new ArrayList<>();
        generate(candidates , target , l , new ArrayList<>() , 0);
        return l;
    }
}