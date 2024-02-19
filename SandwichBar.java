import java.util.HashSet;

public class SandwichBar {
    public int whichOrder(String[] available, String[] orders){
       int sammyIndex = -1;

       //make hashset of available
       HashSet<String> aIngredients = new HashSet<String>();
       for(String s : available){
            aIngredients.add(s);
       }

       //make forloop hashset of order ingredients
       for(int i = 0; i < orders.length; i++){
            HashSet<String> oIngredients = new HashSet<String>();
            String[] oArray = orders[i].split(" ");

            for(String s : oArray){
                oIngredients.add(s);
            }

            if(aIngredients.containsAll(oIngredients)){
                return i;
            }

       }

       return sammyIndex; 
    }
 }