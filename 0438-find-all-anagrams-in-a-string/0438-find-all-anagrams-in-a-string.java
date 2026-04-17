class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int sL = s.length();
        int pL = p.length();
        if (pL > sL) return new ArrayList<>();
        int[] count = new int[26];
        boolean[] inP = new boolean[26];
        int dem = 0;
        for(char c: p.toCharArray()){
            int cI = c - 'a';
            count[cI]++;
            if(!inP[cI]){
                inP[cI] = true;
                dem++;
            }
        }
        int occ = 0;
        List<Integer> ans = new ArrayList<>(sL-pL+1);
        for(int i =0; i< pL; i++){
            int cI = s.charAt(i)-'a';
            if(inP[cI]){
                count[cI]--;
                if(count[cI]==0){
                    occ++;
                }
                else if(count[cI] == -1) occ--;
            }
        }
        if(occ == dem) ans.add(0);
        for(int i =pL; i<sL; i++){
            int currI = s.charAt(i)-'a';
            if(inP[currI]){
                count[currI]--;
                if(count[currI] == 0) occ++;
                else if(count[currI] == -1) occ--;
            }
            int prevI = s.charAt(i-pL)-'a';
            if(inP[prevI]){
                count[prevI]++;
                if(count[prevI] == 0) occ++;
                else if(count[prevI] == 1) occ--;
            }
            if(occ == dem) ans.add(i-pL+1);
        }
        return ans;
    }
}