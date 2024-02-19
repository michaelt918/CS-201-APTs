import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class SetAside {
    /**
     * @param list
     * @return
     */
    public String common(String[] list) {
        // replace this with your code
        //loop through every string, add to hashset of unique words, loop through every unique word
        //count if word is in all, if in all, add to return arraylist, sort, add to return array
        int numStrings = list.length;
        HashSet<String> uniqueWords = new HashSet<>();
        ArrayList<String> commons = new ArrayList<>();
        for(String s : list){
            String[] words = s.split(" ");
            for(String t : words){
                uniqueWords.add(t);
            }
        }
        for(String s : uniqueWords){
            int count = 0;
            for(String t : list){
                if(t.contains(s)){
                    count++;
                }
            }
            if(count == numStrings){
                commons.add(s);
            }
        }

        commons.sort(null);
        String ret = String.join(" ", commons);
        
        return ret;
    }

}