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
    public boolean isCousins(TreeNode root, int x, int y) {

        if(root == null) return false;

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        int lvl=0;
        int xp = -1;
        int xl = -1;
        int yp = -1;
        int yl = -1;

        while(!q.isEmpty()){
            TreeNode currNode = q.remove();

            if(currNode == null){
                lvl++;

                if(q.isEmpty()) {
                    break;
                }else {
                    q.add(null);
                }
            }else{                
               if (currNode.left != null) {
                    q.add(currNode.left);

                    if (currNode.left.val == x) {
                        xp = currNode.val;
                        xl = lvl + 1;
                    }
                    if (currNode.left.val == y) {
                        yp = currNode.val;
                        yl = lvl + 1;
                    }
                }

                if (currNode.right != null) {
                    q.add(currNode.right);

                    if (currNode.right.val == x) {
                        xp = currNode.val;
                        xl = lvl + 1;
                    }
                    if (currNode.right.val == y) {
                        yp = currNode.val;
                        yl = lvl + 1;
                    }
                }
            }
        }

        return xl == yl && xp != yp;
    }
}