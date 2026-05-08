class Solution {
    private int answer;

    public int diameterOfBinaryTree(TreeNode root) {
        answer = 0;
        height(root);
        return answer;
    }

    private int height(TreeNode node) {
        if (node == null) {
            return 0;
        }

        int left = height(node.left);
        int right = height(node.right);

        answer = Math.max(answer, left + right);

        return Math.max(left, right) + 1;
    }
}
