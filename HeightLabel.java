public class HeightLabel {
    public TreeNode rewire(TreeNode t) {
        // replace with working code
        if(t == null)
            return null;
        TreeNode rewired = new TreeNode(height(t), rewire(t.left), rewire(t.right));
        return rewired;
    }

    public int height(TreeNode t){
        if(t == null)
            return 0;
        return Math.max(height(t.left), height(t.right)) + 1;
    }
}