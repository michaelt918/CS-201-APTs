public class DNAMaxNucleotide {
    public String max(String[] strands, String nuc) {
        String desiredStand = "";
        int maxNuc = -1;
        int maxLength = 0;
        char charNuc = nuc.charAt(0);

        for(String s : strands){
            int numNuc = 0;

            // counts number of nuc in DNA string
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == charNuc) {
                    numNuc++;
                }
            }

            // check if the strand has the most nuc and assign max
            if(numNuc >= maxNuc && numNuc != 0){
                maxNuc = numNuc;
            }

        }

        for(String s : strands){
            int numNuc = 0;

            // counts number of nuc in DNA string
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == charNuc) {
                    numNuc++;
                }
            }

            // check if the strand has the most nuc and assign max length if so
            if(numNuc == maxNuc){
                if(s.length() > maxLength){
                    maxLength = s.length();
                }
            }

            // assign strand if desired
            if(numNuc == maxNuc && s.length() == maxLength){
                desiredStand = s;
            }
        }

        return desiredStand;
    }
 }