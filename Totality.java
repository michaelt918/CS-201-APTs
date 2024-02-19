public class Totality {
    int sumValue;

    public int sum(int[] a, String stype) {
        if(stype.equals("even")){
            for(int i = 0; i < a.length; i = i + 2){
                sumValue += a[i];
            }
        }
        if(stype.equals("odd")){
            for(int i = 1; i < a.length; i = i + 2){
                sumValue += a[i];
            }
        }
        if(stype.equals("all")){
            for(int number : a)
            sumValue += number;
        }
        return sumValue;
    }
}