package tree;

// 617. 合并二叉树
// https://leetcode-cn.com/problems/merge-two-binary-trees/
public class MergeTrees_617 {

    // 递归地合并即可
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if (root1 == null) {
            return root2;
        }
        if (root2 == null) {
            return root1;
        }
        TreeNode rootNode = new TreeNode(root1.val + root2.val);
        rootNode.left = mergeTrees(root1.left, root2.left);
        rootNode.right = mergeTrees(root1.right, root2.right);
        return rootNode;
    }
}
