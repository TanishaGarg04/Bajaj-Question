class Solution {
    private int count;
    private int answer;

    public int kthSmallest(TreeNode root, int k) {
        count = k;
        answer = -1;
        inorder(root);
        return answer;
    }

    private void inorder(TreeNode node) {
        if (node == null) {
            return;
        }

        inorder(node.left);

        count--;
        if (count == 0) {
            answer = node.val;
            return;
        }

        inorder(node.right);
    }
}
