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
    int maxlevel = 0;
    public void right(TreeNode root , int level , ArrayList<Integer> l)
    {
        if(root != null)
        {
             if(level > maxlevel)
            {
                maxlevel = level;
                l.add(root.val);
            }
            right(root.right ,level+1 , l);
            right(root.left ,level+1 , l);
        }
    }

    public List<Integer> rightSideView(TreeNode root) {
        ArrayList<Integer> l = new ArrayList<Integer>();
        right(root , 1 , l);
        return l;
    }
}