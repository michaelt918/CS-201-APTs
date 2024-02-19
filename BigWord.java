import java.util.ArrayList;
import java.util.Collections;

public class BigWord {
    public String most(String[] sentences) {
        int mostNum = 0;
        String ret = "";

        //make an arraylist with all words
        ArrayList<String> words = new ArrayList<>();

        for(String s : sentences){
            String[] senArray = s.split(" ");
            for(String t : senArray){
                words.add(t.toLowerCase());
            }
        }

        //find most common word
        for(String s : words){
            if(Collections.frequency(words, s) > mostNum){
                mostNum = Collections.frequency(words, s);
                ret = s;
            }
        }

        return ret.toLowerCase();
    }
}