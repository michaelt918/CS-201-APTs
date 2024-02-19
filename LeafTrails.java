import java.util.TreeMap;

public class LeafTrails {

    public String[] trails(TreeNode tree) {
        TreeMap<Integer, String> trailArr = new TreeMap<>();

        appendToPath(tree, "", trailArr);

        String[] ret = new String[trailArr.size()];

        int i = 0;
        for(String s: trailArr.values()) {
            ret[i] = s;
            i++;
        }

        return ret;
    }

    public void appendToPath(TreeNode root, String pathSoFar, TreeMap<Integer, String> trailArr) {

        if(root == null) return;

        // is Leaf
        if(root.left == null && root.right == null) {
            trailArr.put(root.info, pathSoFar);
            return;
        }

        appendToPath(root.left, pathSoFar + "0", trailArr);
        appendToPath(root.right, pathSoFar + "1", trailArr);
    }
}