import java.util.ArrayList;

public class StringCuts {
    public String[] filter(String[] list, int minLength) {
        ArrayList<String> wordList = new ArrayList();
        for(String s : list){
            if(! wordList.contains(s) && s.length() >= minLength){
                wordList.add(s);
            }
        }

        String[] ret = new String[wordList.size()];
        for(int i = 0; i < wordList.size(); i++){
            ret[i] = wordList.get(i);
        }
        return ret;
    }
}