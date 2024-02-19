import java.util.ArrayList;
import java.util.Arrays;

public class Aaagmnrs {
    public String[] anagrams(String[] phrases) {
       //loop through each element of phrases, turn to char array, sort char array, turn array to string without spaces
       //add alphabetized string to arraylist if not already in it, add corresponding element from phrases
       //to another ArrayList, finally make return array and elememts to it

       ArrayList<String> pLetters = new ArrayList<>();
       ArrayList<String> pWords = new ArrayList<>();
        for(String s : phrases){
            char[] cArray = s.toCharArray();
            for(int i = 0; i < cArray.length; i++){
                cArray[i] = Character.toLowerCase(cArray[i]);
            }
            Arrays.sort(cArray);
            String letters = "";
            for(char c : cArray){
                String cString = "" + c;
                if(c != ' ')
                    letters = String.join("", letters, cString);
            }
            letters.toLowerCase();
            if(! pLetters.contains(letters)){
                pLetters.add(letters);
                pWords.add(s);
            }
        }
        String[] ret = new String[pWords.size()];
        for(int i = 0; i < pWords.size(); i++){
            ret[i] = pWords.get(i);
        }
        return ret;
    }
/*
    public static void main(String[] args){
        String[] aargs = { "Aaagmnrs", "TopCoder", "anagrams", "Drop Cote" };
        System.out.println(anagrams(aargs));
    }
    */
 }