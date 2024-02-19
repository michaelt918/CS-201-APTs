import java.util.ArrayList;
import java.util.HashMap;

public class Encryption {
    public String encrypt(String message){
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String ret = "";
        ArrayList<Character> mArray = new ArrayList<Character>();
        for(int i = 0; i < message.length(); i++){
            mArray.add(message.charAt(i));
        }

        int numLetters = 0;
        HashMap<Character, Character> map = new HashMap<>();
        for(int i = 0; i < message.length(); i++){
            if(! map.containsKey(message.charAt(i))){
                map.put(message.charAt(i), alphabet.charAt(numLetters));
                numLetters++;
            }
        }

        for(Character c : mArray){
            ret += map.get(c);
        }
        return ret;
    }
}