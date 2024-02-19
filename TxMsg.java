import java.util.ArrayList;

public class TxMsg {

    public String convert(String word){

        // make an arraylist with vowels
        ArrayList<String> vowels = new ArrayList<String>();
        vowels.add("a");
        vowels.add("e");
        vowels.add("i");
        vowels.add("o");
        vowels.add("u");

        // make an an arraylist with consonants
        ArrayList<String> consonants = new ArrayList<String>();
        consonants.add("b");
        consonants.add("c");
        consonants.add("d");
        consonants.add("f");
        consonants.add("g");
        consonants.add("h");
        consonants.add("j");
        consonants.add("k");
        consonants.add("l");
        consonants.add("m");
        consonants.add("n");
        consonants.add("p");
        consonants.add("q");
        consonants.add("r");
        consonants.add("s");
        consonants.add("t");
        consonants.add("v");
        consonants.add("w");
        consonants.add("x");
        consonants.add("y");
        consonants.add("z");

        /*plan: check for consonants, assign vowel word, check for preceding consonants
         delete succeeding consonants starting from back, delete vowels, return consonant words
        */
        
        //check for consonants, return vowel word
        boolean charCheck = false;
        for(int i = 0; i < word.length(); i++){
            String charConv = "" + word.charAt(i);
            if(consonants.contains(charConv)){
                charCheck = true;
            }
        }
        if(charCheck == false){
            return word;
        }

        //check for preceding consonants, delete succeeding consonants starting from back, delete vowels, assign consonant words
        String noPC = "";
        char[] splitWord1 = word.toCharArray();
        for(int i = splitWord1.length - 1; i > 0; i--){
            String charConv = "" + splitWord1[i - 1];
            if(vowels.contains(charConv)){
                noPC = splitWord1[i] + noPC;
            }
        }
        noPC = word.charAt(0) + noPC;

        String msg = "";
        char[] splitWord2 = noPC.toCharArray();
        for(char c : splitWord2){
            String charConv = "" + c;
            if(consonants.contains(charConv)){
                msg = msg + charConv;
            }
        }

        return msg;
    }
    

    public String getMessage(String original){
        String[] data = original.split(" ");
        String[] ret = new String[data.length];

        for(int k = 0; k < data.length; k++){
            ret[k] = convert(data[k]);
        }
        return String.join(" ", ret);

    }

 }