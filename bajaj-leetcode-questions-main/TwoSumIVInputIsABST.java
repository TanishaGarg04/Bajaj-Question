import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean findTarget(TreeNode root, int k) {
        Set<Integer> seen = new HashSet<>();
        return search(root, k, seen);
    }

    private boolean search(TreeNode node, int k, Set<Integer> seen) {
        if (node == null) {
            return false;
        }

        if (seen.contains(k - node.val)) {
            return true;
        }

        seen.add(node.val);

        return search(node.left, k, seen) || search(node.right, k, seen);
    }
}
