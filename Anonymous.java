import java.util.ArrayList;
import java.util.Collections;

public class Anonymous {
    public static void main(String[] args) {
        String[] headlines = {"Earthquake in San Francisco ", " Burglary at musuem in Sweden ", " Poverty "};
        String[] messages = {"Give me my money back ", " I am the best coder ", " TOPCODER "};
        System.out.println(new Anonymous().howMany(headlines, messages));
    }
        
      public int howMany(String[] headlines, String[] messages) {

        int ret = 0;
        ArrayList<Character> hList = new ArrayList<>();
        for(String s : headlines){
            char[] hArray = s.toLowerCase().toCharArray();
            for(char c : hArray){
                if(c != ' '){
                    hList.add(c);
                }
            }
        }

        for(String s : messages){
            boolean valid = true;
            ArrayList<Character> mList = new ArrayList<>();
            char[] mArray = s.toLowerCase().toCharArray();
            for(char c : mArray){
                if(c != ' '){
                    mList.add(c);
                }
            }
            for(char c : mList){
                if(Collections.frequency(hList, c) < Collections.frequency(mList, c)){
                    //System.out.println(s +" is invalid because " + c);
                    valid = false;
                    break;
                }
            }
            if(valid == true){
                ret++;
            }
        }

        return ret;
      }
   }