import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

public class SortedFreqs {
    public int[] freqs(String[] data) {
      // fill in code here

        HashMap<String, Integer> map = new HashMap<>();
        for(String s : data){
            map.put(s, 0);
        }

        for(String s : data){
            map.put(s, map.get(s)+1);
        }

        HashSet<String> unique = new HashSet<>();
        for(String s : data){
            unique.add(s);
        }

        ArrayList<String> ordered = new ArrayList<>();
        for(String s : unique){
            ordered.add(s);
        }

        Collections.sort(ordered);

        int[] ret = new int[ordered.size()];

        for(int i = 0; i < ordered.size(); i++){
            ret[i] = map.get(ordered.get(i));
        }

        return ret;
    }
 }