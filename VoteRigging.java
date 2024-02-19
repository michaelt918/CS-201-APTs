public class VoteRigging {
    public int minimumVotes(int[] votes) {
        int req = 0;
        int winner = getMax(votes);
        while(winner != 0){
            votes[winner]--;
            votes[0]++;
            req++;
            winner = getMax(votes);
        }
        return req;
    }

    private int getMax(int[] iArray){
        int max = 0;
        for(int i = 0; i < iArray.length; i++){
            if(iArray[max] <= iArray[i]){
                max = i;
            }
        }
        return max;
    }
 }