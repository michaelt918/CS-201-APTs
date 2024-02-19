import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class MemberCheck {
    public String[] whosDishonest(String[] club1, 
                                  String[] club2, 
                                  String[] club3) {
                                    
            HashSet<String> allPeople = new HashSet<String>();
            ArrayList<String> liars = new ArrayList<String>();

           ArrayList<String> c1List = new ArrayList<String>();
           for(String s : club1){
                if(! c1List.contains(s)){
                    c1List.add(s);
                    allPeople.add(s);
                }    
           }

           ArrayList<String> c2List = new ArrayList<String>();
           for(String s : club2){
                if(! c2List.contains(s)){
                    c2List.add(s);
                    allPeople.add(s);
                }    
           }

           ArrayList<String> c3List = new ArrayList<String>();
           for(String s : club3){
                if(! c3List.contains(s)){
                    c3List.add(s);
                    allPeople.add(s);
                }    
           }
           
           for(String s : allPeople){
                int num = 0;
                if(c1List.contains(s)){
                    num++;
                }
                if(c2List.contains(s)){
                    num++;
                }
                if(c3List.contains(s)){
                    num++;
                }
                if(num > 1){
                    liars.add(s);
                }
           }

           Collections.sort(liars);
           String[] ret = new String[liars.size()];
           for(int i = 0; i < liars.size(); i++){
                ret[i] = liars.get(i);
           }
           return ret;
    }
 }