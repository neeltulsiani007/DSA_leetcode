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
    int count = 0;
    public void inorder(TreeNode root, int k, ArrayList<Integer> l)
    {
        if(root != null)
        {
            inorder(root.left , k ,l);
            count++;
            if(count == k){
            l.add(root.val);
            return;
            }
            inorder(root.right , k,l);

        }
        return;
    }
    public int kthSmallest(TreeNode root, int k) {

        ArrayList<Integer> l = new ArrayList<Integer>();
        inorder(root , k  , l);
        return l.get(0);
    }
}