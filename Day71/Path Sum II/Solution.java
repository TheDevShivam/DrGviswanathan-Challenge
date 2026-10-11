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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans = new LinkedList<>();
        List<Integer> path = new LinkedList<>();
        int sum=0;
        hasPathSumHelp(root,sum,targetSum,path,ans);
        return ans;
    }

    public void hasPathSumHelp(TreeNode root, int sum, int targetSum,List<Integer> path, List<List<Integer>> ans){
        if(root == null) return;

        sum += root.val;
        path.add(root.val);

        if (root.left == null && root.right == null && sum == targetSum) {
            ans.add(new LinkedList<>(path));
        }
        hasPathSumHelp(root.left, sum, targetSum,path,ans);
        hasPathSumHelp(root.right, sum, targetSum,path,ans);

        path.remove(path.size() - 1);
    }
}