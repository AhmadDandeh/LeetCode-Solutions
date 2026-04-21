class Solution {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> ans = new ArrayList<>();
        int n = words.length, currLineLenWithoutSpaces = 0, wordsInLine = 0;
        StringBuilder sb = new StringBuilder();
        
        for(int i =0; i<n; ){
            currLineLenWithoutSpaces = words[i].length();
            wordsInLine = 1;
            for(int j = i+1; j<n; j++){
                if(currLineLenWithoutSpaces + words[j].length() <= maxWidth-wordsInLine){
                    currLineLenWithoutSpaces += words[j].length();
                    wordsInLine++;
                }
                else{
                    break;
                }
            }
            // Build the Line
            sb.append(words[i]);
            if(wordsInLine == 1){
                for(int j = currLineLenWithoutSpaces; j<maxWidth; j++){
                    sb.append(' ');
                }
            }
            else if(i + wordsInLine == n){ // final line
                for(int j = 1; j<wordsInLine; j++){
                    sb.append(' ');
                    sb.append(words[i+j]);
                }
                int remainSpaces = maxWidth - (currLineLenWithoutSpaces + (wordsInLine-1));
                for(int j = 0; j<remainSpaces; j++){
                    sb.append(' ');
                }
            }
            else{
                int spacesBetweenWords = (maxWidth-currLineLenWithoutSpaces)/(wordsInLine-1);
                int remainSpaces = maxWidth-(currLineLenWithoutSpaces+ spacesBetweenWords*(wordsInLine-1));
                for(int j = 1; j<wordsInLine; j++){
                    if(remainSpaces>0){
                        sb.append(' ');
                        remainSpaces--;
                    }
                    for(int k = 0; k<spacesBetweenWords; k++){
                        sb.append(' ');
                    }
                    sb.append(words[i+j]);
                }
            }
            ans.add(sb.toString());
            sb.setLength(0);
            // Change i depends on the number of words in the line
            i += wordsInLine;
        }
        
        return ans;
    }
}