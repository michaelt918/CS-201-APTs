import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Translate {
    public int numAlternates(String original, String translated) {
        // TODO: fill in code here
        
        String[] oWords = original.split(" ");
        String[] tWords = translated.split(" ");
        HashSet<String> UniqueO = new HashSet<>();
        for(int i = 0; i < oWords.length; i++){
            UniqueO.add(oWords[i]);
        }

        HashMap<String, String> map = new HashMap<String, String>();
        for(int i = 0; i < oWords.length; i++){
            map.put(oWords[i], "");
        }
        for(int i = 0; i < oWords.length; i++){
            if(! map.get(oWords[i]).contains(tWords[i])){
                map.put(oWords[i], map.get(oWords[i]) + tWords[i] + " ");
            }
        }

        int count = 0;
        for(String s : UniqueO){
            String[] sWords = map.get(s).split(" ");
            if(sWords.length > 1){
                count += sWords.length;
            }
            
        }

        return count;
        
    }
}