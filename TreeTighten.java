public class TreeTighten {
    public TreeNode tighten(TreeNode t) {
        // replace with working code
        if(t == null){
            return null;
        }
        if(t.left ==  null && t.right == null){
            return t;
        }
        t.left = tighten(t.left);
        t.right = tighten(t. right);
        
        if(t.left !=  null && t.right != null){
            return t;
        }
        if(t.left !=  null && t.right == null)
            return tighten(t.left);
        if(t.left ==  null && t.right != null)
            return tighten(t.right);
        
        return t;
    }
}