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
    public List<Integer> postorderTraversal(TreeNode root) {

        List<Integer> l = new ArrayList<Integer>();
        Stack<TreeNode> st = new Stack<>();

        if(root == null)
        return l;

        TreeNode curr = root;

        while(curr != null || !st.isEmpty())
        {
       
            if(curr!= null)
            {
                l.add(curr.val);
                st.push(curr);
                curr = curr.right;
            }
            else
            {
                curr = st.pop();
                curr = curr.left;
            }
        }
       Collections.reverse(l);

        return l;
    }
}