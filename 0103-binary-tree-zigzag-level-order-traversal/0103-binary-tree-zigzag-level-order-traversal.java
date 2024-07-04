/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        
        List<List<Integer>> l = new ArrayList<>();

        Queue<TreeNode> q = new LinkedList<>();
        Stack<TreeNode> st = new Stack<>();
        if(root == null)
        return l;
        q.add(root);
        boolean reverse = false;

        while(!q.isEmpty())
        {
            int c = q.size();
            ArrayList<Integer> t1 = new ArrayList<>();
            for(int i = 0;i<c;i++)
            {
                if(reverse)
                {
                    TreeNode temp = q.poll();
                    st.push(temp);
                    if(temp.left != null)
                    q.add(temp.left);
                    if(temp.right!=null)
                    q.add(temp.right);
                }
                else
                {
                    TreeNode temp = q.poll();
                    t1.add(temp.val);
                    if(temp.left != null)
                    q.add(temp.left);
                    if(temp.right!=null)
                    q.add(temp.right);
                }
            }
            while(!st.isEmpty())
            t1.add(st.pop().val);
            reverse = !reverse;
            l.add(t1);
        }
        return l;
    }
}