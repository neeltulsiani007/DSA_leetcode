class Solution {

    public static void generate(int[] candidates , int sum ,List<List<Integer>> l, ArrayList<Integer> temp , int start )
    {
        if(sum<0 || start>candidates.length)
        return;


        if(sum == 0)
        {
            l.add(new ArrayList<>(temp));
            return;
        }
       
        
   
            for(int i =start ; i<candidates.length;i++){
            if (i > start && candidates[i] == candidates[i - 1]) continue;
            if (candidates[i] > sum) break;
            temp.add(candidates[i]);
            generate(candidates , sum-candidates[i] , l ,temp , i+1);
            temp.remove(temp.size()-1);
            }


    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        
         List<List<Integer>> l = new ArrayList<>();
         Arrays.sort(candidates);
        generate(candidates , target , l , new ArrayList<>() , 0);
        return l;

    }
}