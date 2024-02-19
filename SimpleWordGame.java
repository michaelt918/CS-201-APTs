import java.util.HashSet;

public class SimpleWordGame {
    public int points(String[] player, String[] dictionary) {
        //make a set for player words
        HashSet<String> pWords = new HashSet<String>();
        for(String s : player){
            pWords.add(s);
        }

        //make a set for dictionary words
        HashSet<String> dWords = new HashSet<String>();
        for(String s : dictionary){
            dWords.add(s);
        }

        //make a set for overlap of player and dictionary
        pWords.retainAll(dWords);

        //make a return value with the correct points
        int ret = 0;
        for(String s : pWords){
            ret += s.length()*s.length();
        }
        return ret;
    }
}