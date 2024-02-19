public class CountShapes {
    int matches = 0;
    public int count(TreeNode countThis, TreeNode root) {
        return 0;
        /*
        int lMatches = 0;
        int rMatches = 0;
        if(root != null && countThis != null && countThis.left != null)
            lMatches = count(countThis.left, root);

        if(root != null && countThis != null && countThis.right != null);
            rMatches = count(countThis.right, root);

        if(matchCheck(countThis, root) == true){
            matches = lMatches + rMatches;
            return matches++;
        }
        matches = lMatches + rMatches;
        return matches;
    }

    private boolean matchCheck(TreeNode countThis, TreeNode root){
        boolean rMatch = true;
        boolean lMatch = true;
        if(root == null)
            return true;
        if(countThis == null){
            return false;
        }
        if(countThis != null){
            if(root.right != null)
                rMatch = matchCheck(countThis.right, root.right);
            if(root.left != null)
                lMatch = matchCheck(countThis.left, root.left);
            return (lMatch && rMatch);
        }
        return false;
        */
    }
}