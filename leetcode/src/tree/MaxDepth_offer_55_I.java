package tree;

// 剑指 Offer 55 - I. 二叉树的深度
// url: https://leetcode-cn.com/problems/er-cha-shu-de-shen-du-lcof/
public class MaxDepth_offer_55_I {
    private int maxDepth = 0;
    public int maxDepth(TreeNode root) {
        dfs(root, 1);
        return maxDepth;
    }

    private void dfs(TreeNode root, int depth) {
        if (root == null) {
            return;
        }

        maxDepth = Math.max(maxDepth, depth);
        dfs(root.left, depth + 1);
        dfs(root.right, depth + 1);
    }
}
