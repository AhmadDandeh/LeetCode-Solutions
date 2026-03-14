class Solution {
    public String reorderSpaces(String text) {
        int spaces = 0, words = 0;
        char lastC = ' ';
        for(char c: text.toCharArray()){
            if(c == ' '){
                spaces++;
                if(lastC != ' ') words++;
            }
            lastC = c;
        }
        if(lastC != ' ') words++;
        int spacesB = (words == 1)? 0 : spaces / (words-1);
        int remain = spaces - (words-1) * spacesB;
        StringBuilder sb = new StringBuilder();
        lastC = ' ';
        for(char c: text.toCharArray()){
            if(c == ' '){
                if(lastC != ' '){
                    if(words == 1) break;
                    words--;
                    for(int i =0; i<spacesB; i++) sb.append(' ');
                }
            }
            else{
                sb.append(c);
            }
            lastC = c;
        }
        
        for(int i = 0; i<remain; i++) sb.append(' ');
        return sb.toString();
    }
}