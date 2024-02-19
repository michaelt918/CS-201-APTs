import java.util.ArrayList;

public class FriendScore {
    public int highestScore(String[] friends) {
        // you fill in code here
        int[] friendCounts = new int[friends.length];
        ArrayList<Integer> iFriends = new ArrayList<>();
        //take care of intermediate 2 friends if not direct friends
        for(int i = 0; i < friendCounts.length; i++){
            for(int j = 0; j < friendCounts.length; j++){
                for(int k = j+1; k < friendCounts.length; k++){
                    boolean intermediate = friends[i].charAt(j) == 'Y' && friends[i].charAt(k) == 'Y';
                    boolean direct = friends[j].charAt(k) == 'Y' && friends[k].charAt(j) == 'Y';
                    if(intermediate == true && direct == false && !iFriends.contains(k + 1000*j)){
                        friendCounts[j]++;
                        friendCounts[k]++;
                        iFriends.add(k + 1000*j);
                    }
                }
            }
        }

        for(int i = 0; i < friendCounts.length; i++){
            for(int j = i+1; j < friendCounts.length; j++){
                boolean direct = friends[i].charAt(j) == 'Y' && friends[j].charAt(i) == 'Y';
                if(direct == true){
                    friendCounts[i]++;
                    friendCounts[j]++;
                }
            }
        }

        int max = 0;
        for(int i : friendCounts){
            max = Math.max(max, i);
        }
        return max;
    }
}
