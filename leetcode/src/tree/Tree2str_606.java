package tree;

// 606. 根据二叉树创建字符串
// https://leetcode-cn.com/problems/construct-string-from-binary-tree/
// 注意不要看官方的描述，像狗屎一样的语言表达
// 题目的意思是子节点需要用()来包裹。
// 举例来说，二叉树[root,left,right]，则转换为root(left)(right)
// 如果root没有子节点：root
// 如果root只有左节点：root(left)
// 如果root只有右节点：root()(right)
public class Tree2str_606 {
    public String tree2str(TreeNode root) {
        //  root, left, right
        return dfs(root);
    }

    private String dfs(TreeNode root) {
        if (root == null) {
            return "";
        }
        if (root.left == null && root.right == null) {
            return root.val + "";
        }
        if (root.right == null) {
            return root.val + "(" + dfs(root.left) + ")";
        }

        return root.val + "(" + dfs(root.left) +")" + "(" + dfs(root.right) + ")";
    }
}
