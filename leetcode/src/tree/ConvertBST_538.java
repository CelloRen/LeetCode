package tree;

import java.util.ArrayList;
import java.util.List;

// 538. 把二叉搜索树转换为累加树
// url: https://leetcode-cn.com/problems/convert-bst-to-greater-tree/
public class ConvertBST_538 {
    List<TreeNode> rightRootLeft = new ArrayList<>();
    public TreeNode convertBST(TreeNode root) {
        // right,root,left
        dfs(root);
        // 二叉树的right,root,left，从大到小排练
        // 累加树其实就是进行如下累加
        for (int i = 0; i < rightRootLeft.size() - 1; i++) {
            rightRootLeft.get(i + 1).val += rightRootLeft.get(i).val;
        }
        return root;
    }

    // 先按照right,root,left，将node塞到list中
    private void dfs(TreeNode root) {
        if (root == null) {
            return;
        }
        dfs(root.right);
        rightRootLeft.add(root);
        dfs(root.left);
    }
}
