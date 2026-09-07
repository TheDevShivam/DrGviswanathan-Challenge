class Solution {
    public String minWindow(String s, String t) {
        int[] hash = new int[256];
        int l=0; int r=0; int min=100000; int sIdx=-1; int count=0;

        for(int i=0; i<t.length(); i++){
            hash[t.charAt(i)]++;
        }
        while(r<s.length()){
            if(hash[s.charAt(r)]>0){
                count++;               
            }
            hash[s.charAt(r)]--;

            while(count == t.length()){
                if(r-l+1 < min){
                    min = r-l+1;
                    sIdx = l;
                }
                hash[s.charAt(l)]++;
                if(hash[s.charAt(l)]>0) count--;
                l++;
            }
            r++;
        }
        return sIdx == -1? "" : s.substring(sIdx, sIdx + min);
    }
}