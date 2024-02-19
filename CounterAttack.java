import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class CounterAttack {
    public int[] analyze(String str, String[] words) {
        String[] strArray = str.split(" ");
        HashMap<String, Integer> map = new HashMap<>();

        //make arrayList copy of words
        ArrayList<String> listWords = new ArrayList<>();
        for(String s : strArray){
            listWords.add(s);
        }

        //make arrayList with ordered unique words
        ArrayList<String> diffWords = new ArrayList<>();
        for(String s : strArray){
            if(! diffWords.contains(s)){
                diffWords.add(s);
            }
        }

        //fill int array with counts of words
        int[] ret = new int[words.length];
        for(int i = 0; i < words.length; i++){
            ret[i] = Collections.frequency(listWords, words[i]);
        }

        return ret;
    }
}