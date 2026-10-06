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
        List<List<Integer>> ans = new LinkedList<>();

        if(root == null) return ans;

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        boolean leftToRight = true;

        List<Integer> level = new LinkedList<>();

        while(!q.isEmpty()){
            TreeNode currNode = q.remove();
            if(currNode == null){
                if(!leftToRight){
                    Collections.reverse(level);
                }

                ans.add(level);
                level = new LinkedList<>();

                leftToRight = !leftToRight; 

                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }
            }else{
                level.add(currNode.val);
                if(currNode.left!=null) q.add(currNode.left);
                if(currNode.right!=null) q.add(currNode.right);
            }
        }

        return ans; 
    }
}