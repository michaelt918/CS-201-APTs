import java.util.ArrayList;
import java.util.Collections;

public class LunchPlans {
    public String[] favorites(String[] preferences) {
        // TODO: fill in code here
        //create arraylist for all foods with duplicates
        //loop through each preferences element and create array perPrefs
        //loop through each perPrefs element and add to arrayList
        //create and loop though array of first preferences element
        //check if frequency of element in arraylist equals array length
        //if so, add to final arraylist
        //convert and return arraylist as an array
        ArrayList<String> allFoods = new ArrayList<>();
        for(String s : preferences){
            String[] perPrefs = s.split(" ");
            for(String t : perPrefs){
                allFoods.add(t);
            }
        }
        String[] firstFoods = preferences[0].split(" ");
        ArrayList<String> finalList = new ArrayList<>();
        for(String s : firstFoods){
            if(Collections.frequency(allFoods, s) == preferences.length){
                finalList.add(s);
            }
        }

        String[] ret = new String[finalList.size()];
        for(int i = 0; i < finalList.size(); i++){
            ret[i] = finalList.get(i);
        }
        return ret;
    }
}