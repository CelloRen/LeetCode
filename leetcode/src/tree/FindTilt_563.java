package tree;

// 563. 二叉树的坡度
// url: https://leetcode-cn.com/problems/binary-tree-tilt/
public class FindTilt_563 {
    int sum = 0;
    public int findTilt(TreeNode root) {
        dfs(root);
        return sum;
    }

    // 返回root的全部节点数
    private int dfs(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftNodes = dfs(root.left);
        int rightNodes = dfs(root.right);
        sum += Math.abs(leftNodes - rightNodes);
        return leftNodes + rightNodes + root.val;
    }
}
