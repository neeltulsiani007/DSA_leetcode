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
    int index = 0;
    public TreeNode cons(int[] inorder, int[] postorder , int is,int ie  ,int pi, int pe,Map<Integer, Integer> map)
    {
        if(is > ie)
        return null;

        // if(pe < 0)
        // return null;

        

        TreeNode root = new TreeNode(postorder[pe]);
        int index = map.get(root.val);

        root.left = cons(inorder , postorder , is , index-1 ,pi , pi+index - is -1,map);
        root.right = cons(inorder , postorder , index+1 , ie , pi-is+index,pe-1,map);
        return root;
    }
    public TreeNode buildTree(int[] inorder, int[] postorder) {
         Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
                map.put(inorder[i], i);
           
        }
        int n = inorder.length;
        return cons(inorder , postorder , 0 , n-1 ,0, n-1,map);
    }
}