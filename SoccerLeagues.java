public class SoccerLeagues {
    public int[] points(String[] matches) {
        int[] scores = new int[matches.length];

        //forloop for each team
        for(int t = 0; t < matches.length; t++){
            //forloop for rows
            for(int i = 0; i < matches.length; i++){
                if(matches[t].charAt(i) == 'W'){
                    scores[t] += 3;
                }

                if(matches[t].charAt(i) == 'D'){
                    scores[t] += 1;
                }
            }

            for(int j = 0; j < matches.length; j++){
                if(matches[j].charAt(t) == 'L'){
                    scores[t] += 3;
                }

                if(matches[j].charAt(t) == 'D'){
                    scores[t] += 1;
                }
            }
        }
        return scores;
    }
}