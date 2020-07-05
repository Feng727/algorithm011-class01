class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        preorder(res, root);
        return res;
    }
    public void preorder(List<Integer> res, TreeNode root) {
        if(root == null)
            return;
        res.add(root.val);
        preorder(res, root.left);
        preorder(res, root.right);
    }
}