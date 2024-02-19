import java.util.Arrays;
import java.util.HashSet;

public class UniqueTreeValues {
    HashSet<Integer> set = new HashSet();
    public int[] unique(TreeNode root) {
        // write code here
        if(root != null){
            unique(root.left);
            set.add(root.info);
            unique(root.right);
        }
        int[] ret = new int[set.size()];
        int i = 0;
        for(Integer ref : set){
            int toAdd = ref;
            ret[i] = toAdd;
            i++;
        }
        Arrays.sort(ret);
        return ret;
    }
    
}