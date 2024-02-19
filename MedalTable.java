import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;

public class MedalTable {
    public String[] generate(String[] results) {
       // you fill in this code
       HashSet<String> countries = new HashSet<>();
       for(String s : results){
            String[] abrev = s.split(" ");
            for(String t : abrev){
                countries.add(t);
            }
       }

       HashMap<String, Integer> gMap = new HashMap<>();
       for(String s : countries){
            gMap.put(s, 0);
       }
       HashMap<String, Integer> sMap = new HashMap<>();
       for(String s : countries){
            sMap.put(s, 0);
       }
       HashMap<String, Integer> bMap = new HashMap<>();
       for(String s : countries){
            bMap.put(s, 0);
       }

       for(String s : results){
            String[] medals = s.split(" ");
            for(int i = 0; i < 3; i++){
                if(i == 0)
                    gMap.put(medals[i], gMap.get(medals[i])+1);
                if(i == 1)
                    sMap.put(medals[i], sMap.get(medals[i])+1);
                if(i == 2)
                    bMap.put(medals[i], bMap.get(medals[i])+1);
            }
       }

       String[] ret = new String[countries.size()];
       int i = 0;
       for(String s : countries){
            ret[i] = s + " " + gMap.get(s) + " " + sMap.get(s) + " " + bMap.get(s);
            i++;
       }

       Comparator<String> aComp = (a, b) -> (a.substring(0,3).compareTo(b.substring(0,3)));
       Comparator<String> gComp = (a, b) -> (-1*gMap.get(a.substring(0,3)).compareTo(gMap.get(b.substring(0,3))));
       Comparator<String> sComp = (a, b) -> (-1*sMap.get(a.substring(0,3)).compareTo(sMap.get(b.substring(0,3))));
       Comparator<String> bComp = (a, b) -> (-1*bMap.get(a.substring(0,3)).compareTo(bMap.get(b.substring(0,3))));

       Arrays.sort(ret, gComp.thenComparing(sComp).thenComparing(bComp).thenComparing(aComp));
       return ret;
    }
  }