public class TreeCount {
    public int count(TreeNode tree) {
        // replace with working code
        if(tree == null)
            return 0;
        return count(tree.left) + count(tree.right) + 1;
    }
}