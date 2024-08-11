class Solution {

     public static void generate(int[] arr , int n  , List<List<Integer>> l ,ArrayList<Integer> temp , int start)
    {
        if(start > n)
        return;
        
        if(start == n)
        {
               l.add(new ArrayList<>(temp)); 
            return;
        }
        
        temp.add(arr[start]);
        generate(arr , n  , l, temp ,start+1);
        temp.remove(temp.size()-1);
        generate(arr , n  , l , temp , start+1);
        return ;
        
        
    }

    public List<List<Integer>> subsets(int[] arr) {
        List<List<Integer>> l = new ArrayList<>();
	    
	    generate(arr , arr.length , l , new ArrayList<>() , 0);
	    
	    return l;
    }
}