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

    public boolean isbst(TreeNode root , long min , long max)
    {
          if(root == null)
        return true;

        return (root.val > min && root.val < max && isbst(root.left,min,root.val) && isbst(root.right , root.val , max));
    }
    public boolean isValidBST(TreeNode root) {
      return isbst(root , Long.MIN_VALUE ,  Long.MAX_VALUE);
    }
}