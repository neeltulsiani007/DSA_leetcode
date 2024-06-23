class Solution {
       public static void generate(int[] candidates , List<List<Integer>> l, ArrayList<Integer> temp , int start )
    {
       
            l.add(new ArrayList<>(temp));
        
            for(int i =start ; i<candidates.length;i++){
            if (i != start && candidates[i] == candidates[i - 1]) continue;

            temp.add(candidates[i]);
            generate(candidates  , l ,temp , i+1);
            temp.remove(temp.size()-1);
            }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
       List<List<Integer>> l = new ArrayList<>();
        Arrays.sort(nums);
        generate(nums  , l , new ArrayList<>() , 0);
        return l;
    }
}