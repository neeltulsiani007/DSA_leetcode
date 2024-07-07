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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        
        TreeNode parent = null;
        TreeNode curr = root;
        TreeNode n = new TreeNode(val);

        while(curr != null)
        {
            parent = curr;
            if(curr.val < val)
            curr = curr.right;
            else
            curr = curr.left;
        }

        if(parent == null)
        return n;
        if(parent.val > val)
        parent.left = n;
        else
        parent.right = n;

        return root;
    }
}