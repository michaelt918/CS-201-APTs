import java.util.Arrays;
import java.util.HashSet;

public class Closet {
    public String anywhere(String[] list) {
        // replace this with your code
        //loop through elements of list, turn strings to arrays of words, add words to Hashset
        //add hashset words to array, sort array, return array
        HashSet<String> uWords = new HashSet<>();
        for(String s : list){
            String[] words = s.split(" ");
            for(String t : words){
                uWords.add(t);
            }
        }
        String[] sArray = new String[uWords.size()];
        int i = 0;
        for(String s : uWords){
            sArray[i] = s;
            i++;
        }
        Arrays.sort(sArray);
        String ret = String.join(" ", sArray);
        return ret;
    }
}