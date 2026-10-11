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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        int sum=0;
        return hasPathSumHelp(root,sum,targetSum);
    }

    public boolean hasPathSumHelp(TreeNode root, int sum, int targetSum){
        if(root == null) return false;
        sum += root.val;
        if (root.left == null && root.right == null) {
            return sum == targetSum;
        }
        return hasPathSumHelp(root.left, sum, targetSum) || hasPathSumHelp(root.right, sum, targetSum);

    }
}