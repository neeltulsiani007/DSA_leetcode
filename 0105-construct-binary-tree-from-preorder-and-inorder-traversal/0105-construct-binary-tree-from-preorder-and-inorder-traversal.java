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
   int pre = 0;
    public TreeNode cons(int[] preorder, int[] inorder  , int is , int ie)
    {
        if(is > ie)
        return null;
        
        int i = is;
        int temp = preorder[pre++];
        TreeNode t = new TreeNode(temp);

        for(i = is;i<=ie;i++)
        {
            if(temp == inorder[i]){
            break;
            }
        }

        t.left = cons(preorder , inorder  , is ,i-1);
        t.right = cons(preorder , inorder  , i+1 , ie);

        return t;

    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {

        return cons(preorder , inorder  , 0 , inorder.length-1);
    }
}