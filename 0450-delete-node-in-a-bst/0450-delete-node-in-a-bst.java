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

    public TreeNode getsuccess(TreeNode root)
    {
       TreeNode curr = root;
            if(curr.right != null)
            curr = curr.right;

            while(curr.left != null)
            curr = curr.left;

            return curr;
    }
        
    

    public TreeNode deleteNode(TreeNode curr, int key) {
        
  


        if(curr == null)
        return curr;

        
            if(curr.val == key)
            {
                if(curr.left == null)
                return curr.right;
                else if(curr.right == null)
                return curr.left;
                else
                    {
                        TreeNode t = getsuccess(curr);
                        curr.val = t.val;
                        curr.right = deleteNode(curr.right,curr.val);
                    }
            }
            else if(curr.val > key)
            curr.left = deleteNode(curr.left , key);
            else
            curr.right = deleteNode(curr.right , key);

        return curr;
    }
}