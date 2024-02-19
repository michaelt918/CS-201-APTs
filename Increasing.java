import java.util.ArrayList;

public class Increasing {
    public int[] getIncreasing(int[] numbers) {
        // TODO: fill in code here
        //create arraylist
        //create int value with first element
        //loop through array and add elements to arraylist if >= than current max
        //update current max
        //turn arraylist to array and return

        ArrayList<Integer> incrList = new ArrayList<>();
        int curMax = numbers[0];
        incrList.add(numbers[0]);

        for(int i : numbers){
            if(i > curMax){
                Integer objI = i;
                incrList.add(objI);
                curMax = i;
            }
        }

        int[] ret = new int[incrList.size()];
        for(int i = 0; i < incrList.size(); i++){
            int j = incrList.get(i);
            ret[i] = j;
        }
        

        return ret;
    }
}