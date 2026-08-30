class Solution {
    public int lengthOfLastWord(String s) {
        int l = s.length()-1;

        while( l >= 0 && s.charAt(l) ==  ' '){
            l--;
        }

        int length = 0;

        while(l >= 0 && s.charAt(l) != ' '){
            length++;
            l--;
        }

        return length;
    }
}