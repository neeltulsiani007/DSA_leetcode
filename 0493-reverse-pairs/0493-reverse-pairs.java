class Solution {

    public void countpairs(int[] arr , int l , int m , int r ,ArrayList<Integer> ans )
    {
        int left = l;
        int right = m+1;
        int count = ans.get(0);
        
        for(int i = l;i<=m;i++)
        {
            while(right <= r && arr[i] > (2*(long)arr[right]))
            {
                right++;
            }
            count+=right-(m+1);
        }
        ans.set(0 , count);
    }
    public void merge(int[] arr , int l ,int m, int r ,ArrayList<Integer> ans )
    {
        ArrayList<Integer> list = new ArrayList<>();
        int count = ans.get(0);
       int left = l;
       int right = m+1;
       
       while(left <= m && right<=r)
       {
           if(arr[left] <= arr[right])
           {
               list.add(arr[left]);
               left++;
           }
           else
           {
               list.add(arr[right]);
               right++;
           }
       }
       
       while(left<=m)
       {
          list.add(arr[left]);
        left++;
       }
       
       while(right <= r)
       {
          list.add(arr[right]);
          right++;
       }
       
       for(int i = l ; i<=r;i++)
       {
           arr[i] = list.get(i-l);
       }
        ans.set(0 , count);
    }
    public void mergesort(int[] arr , int l , int r,ArrayList<Integer> ans)
    {
        if(l>=r)
        return;
        
        int mid = (l+r)/2;
        mergesort(arr , l ,mid,ans);
        mergesort(arr , mid+1 , r,ans);
        countpairs(arr , l , mid ,r ,ans);
        merge(arr , l ,mid,r,ans);

    }
    public int reversePairs(int[] arr) {
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(0);
        int n = arr.length;
         mergesort(arr , 0 , n-1 , ans);
         return ans.get(0);
    }
}