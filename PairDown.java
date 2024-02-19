public class PairDown {
    public int[] fold(int[] list) {
        // change this code
        //find length of list
        int listLength = list.length/2 + list.length%2;
        int[] pairs = new int[listLength];

        for(int i = 0; i < listLength; i++){
            if(2*i + 1 < list.length){
                pairs[i] = list[2*i] + list[2*i+1];
            }
            else{
                pairs[i] = list[2*i];
            }
        }
        return pairs;
    }
}