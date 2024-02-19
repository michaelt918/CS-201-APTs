public class HuffmanDecoding {
    public String decode(String archive, String[] dictionary) {
          // fill in code here
          //check - if in dict, add index, move start intex
          // .    - else move end index and try again
          // turn index string into letter string

          int start = 0;
          int end = 1;
          String cString = "";
          while(end <= archive.length()){
            String bString = archive.substring(start, end);
            int c = 0;
            for(int i = 0; i < dictionary.length; i++){
                if(dictionary[i].equals(bString)){
                    c = 1 + i;
                    if(c == 1) cString += 'A';
                    if(c == 2) cString += 'B';
                    if(c == 3) cString += 'C';
                    if(c == 4) cString += 'D';
                    if(c == 5) cString += 'E';
                    if(c == 6) cString += 'F';
                    if(c == 7) cString += 'G';
                    if(c == 8) cString += 'H';
                    if(c == 9) cString += 'I';
                    if(c == 10) cString += 'J';
                    if(c == 11) cString += 'K';
                    if(c == 12) cString += 'L';
                    if(c == 13) cString += 'M';
                    if(c == 14) cString += 'N';
                    if(c == 15) cString += 'O';
                    if(c == 16) cString += 'P';
                    if(c == 17) cString += 'Q';
                    if(c == 18) cString += 'R';
                    if(c == 19) cString += 'S';
                    if(c == 20) cString += 'T';
                    if(c == 21) cString += 'U';
                    if(c == 22) cString += 'V';
                    if(c == 23) cString += 'W';
                    if(c == 24) cString += 'X';
                    if(c == 25) cString += 'Y';
                    if(c == 26) cString += 'Z';
                    start += dictionary[i].length();
                }
            }
            end++;
          }
          return cString;
    }
 }