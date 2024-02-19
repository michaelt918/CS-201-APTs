public class TrueSpace {
    public long calculateSpace(int[] sizes, int clusterSize) {
       long total = 0;

       for(int n : sizes){
            total += (n / clusterSize) * clusterSize;
            if(n % clusterSize != 0){
                total += clusterSize;
            }
       }

       return total;
    }
 }