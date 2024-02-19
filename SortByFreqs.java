import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;

public class SortByFreqs {
    public String[] sort(String[] data) {
        // fill in code here
        ArrayList<String> copy = new ArrayList<>();
        for(String s : data){
            copy.add(s);
        }

        HashSet<String> uniqueSet = new HashSet<>();
        for(String s : data){
            uniqueSet.add(s);
        }

        ArrayList<String> edits = new ArrayList<>();
        for(String s : uniqueSet){
            edits.add(s);
        }

        Comparator<String> comp = (a, b) -> (Collections.frequency(copy, b) - Collections.frequency(copy, a));
        Comparator<String> comp2 = (a, b) -> (a.compareTo(b));

        Collections.sort(edits, comp.thenComparing(comp2));

        String[] ret = new String[edits.size()];
        for(int i = 0; i < edits.size(); i++){
            ret[i] = edits.get(i);
        }

        return ret;
    }
 }