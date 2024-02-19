public class AccessLevel {
    String output = "";
     public String canAccess(int[] rights, int minPermission) {
        for(int rightLevel : rights){
            if(rightLevel >= minPermission){
                output += "A";
            }
            else{
                output += "D";
            }
        }
        return output;
     }
  }