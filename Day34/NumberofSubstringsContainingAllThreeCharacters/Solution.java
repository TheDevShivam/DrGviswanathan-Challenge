class Solution {
    public int numberOfSubstrings(String s) {
        int[] lastseen = {-1, -1, -1};
        int count = 0;
        for(int r = 0; r < s.length(); r++) {
            lastseen[s.charAt(r) - 'a'] = r;
            count += Math.min(lastseen[0], Math.min(lastseen[1], lastseen[2])) + 1;
        }
        return count;
    }
}