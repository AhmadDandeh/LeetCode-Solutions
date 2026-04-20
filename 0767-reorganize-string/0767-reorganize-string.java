class Solution {
    record Element(int freq, char c){}

    public String reorganizeString(String s) {
        int sLen = s.length();
        if(sLen == 1) return s;
        PriorityQueue<Element> pq = new PriorityQueue<>(
            Comparator.comparingInt(Element::freq).reversed()
        );
        int[] f = new int[26];
        for(char c: s.toCharArray()){
            f[c-'a']++;
        }

        for(int i=0; i< 26; i++){
            if(f[i]> (sLen+1) / 2) return "";
            if(f[i]>0) pq.add(new Element(f[i], (char) ('a' + i)));
            
        }
        StringBuilder sb = new StringBuilder(sLen);
        while(pq.size()>1){
            Element e1 = pq.remove();
            Element e2 = pq.remove();

            sb.append(e1.c());
            sb.append(e2.c());
            if(e1.freq()>1) pq.add(new Element(e1.freq()-1, e1.c()));
            if(e2.freq()>1) pq.add(new Element(e2.freq()-1, e2.c()));
        }
        if(pq.size() == 1){
            Element last = pq.remove();
            if(last.freq() != 1) return "";
            sb.append(last.c());
        }
        return sb.toString();
    }
}