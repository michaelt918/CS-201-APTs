import java.util.ArrayList;

public class Starter {
    int numFirsts;
    public int begins(String[] words, String first) {

        ArrayList<String> uniqueWords = new ArrayList<String>();
        for(String word : words){
            if(uniqueWords.contains(word) != true){
                uniqueWords.add(word);
            }
        }

        for(int i = 0; i < uniqueWords.size(); i++){
            if(first.equals(uniqueWords.get(i).substring(0, 1))){
                numFirsts++;
            }
        }
        return numFirsts;
    }
}