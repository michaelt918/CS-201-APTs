import java.util.ArrayList;

public class LeafCollector {
    public String[] getLeaves(TreeNode tree) {
        ArrayList<ArrayList<String>> rounds = new ArrayList<>();

        ArrayList<String> currentLeaves;
        while(tree.left != null || tree.right != null) {
            currentLeaves = new ArrayList<>();
            collectAndRemove(tree, currentLeaves);
            rounds.add(currentLeaves);
        }

        currentLeaves = new ArrayList<>();
        currentLeaves.add(String.valueOf(tree.info));

        rounds.add(currentLeaves);

        String[] ret = new String[rounds.size()];

        for (int i = 0; i < rounds.size(); i++) {
            ArrayList<String> round = rounds.get(i);
            ret[i] = String.join(" ", round);
        }

        return ret;
    }

    private void collectAndRemove(TreeNode root, ArrayList<String> list){
        if(root == null){
            return;
        }
        if(root.left != null && isLeaf(root.left)){
            list.add("" + root.left.info);
            root.left = null;
        }
        else{
            collectAndRemove(root.left, list);
        }
        if(root.right != null && isLeaf(root.right)){
            list.add("" + root.right.info);
            root.right = null;
        }
        else{
            collectAndRemove(root.right, list);
        }
    }

    public boolean isLeaf(TreeNode node) {
        return node.left == null && node.right == null;
    }
}