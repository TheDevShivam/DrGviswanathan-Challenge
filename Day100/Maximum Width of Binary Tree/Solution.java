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
    class Pair {
        TreeNode node;
        int idx;

        Pair(TreeNode node, int idx) {
            this.node = node;
            this.idx = idx;
        }
    }

    public int widthOfBinaryTree(TreeNode root) {
        if(root == null) return 0;

        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(root, 0));
        q.add(null);

        int ans = 0;
        int first = 0, last = 0;
        int min = 0;

        while(!q.isEmpty()) {
            Pair curr = q.remove();

            if(curr == null) {
                ans = Math.max(ans, last - first + 1);

                if(q.isEmpty()) break;

                min = q.peek().idx;
                q.add(null);

            } else {
                int idx = curr.idx - min;

                if(first == -1) first = idx;
                last = idx;

                if(curr.node.left != null) {
                    q.add(new Pair(curr.node.left, 2 * idx));
                }

                if(curr.node.right != null) {
                    q.add(new Pair(curr.node.right, 2 * idx + 1));
                }
            }
        }

        return ans;
    }
}