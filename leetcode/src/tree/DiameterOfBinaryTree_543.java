package tree;

// 543. 二叉树的直径
// url: https://leetcode-cn.com/problems/diameter-of-binary-tree/
public class DiameterOfBinaryTree_543 {
    int max = 0;

    // 求直径，其实就是求树中任意两个节点最大路径
    // 路径的计算函数：以路径中最靠上的节点为node
    // depth(node) = max(depth(left), depth(right)) + 1
    public int diameterOfBinaryTree(TreeNode root) {
        depth(root);
        // 路径长度 = 节点数 - 1
        return max - 1;
    }

    private int depth(TreeNode root) {
        if (root == null || (root.left == null && root.right == null)) {
            return 0;
        }
        int left = depth(root.left);
        int right = depth(root.right);
        max = Math.max(max, left + right + 1);
        return Math.max(left, right) + 1;
    }
}
