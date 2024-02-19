public class PathSum {
    public int hasPath(int target, TreeNode tree){
        if (tree == null) return 0;
        
        target -= tree.info;
        if (target == 0 && tree.left == null && tree.right == null) {
            return 1;
        }
        int left = hasPath(target, tree.left);
        int right = hasPath(target, tree.right);
        
        return left + right;
    }
}