class Solution {
    public String sortSentence(String s) {
        String[] s1 = s.split(" ");
        String[] arr = new String[s1.length];

        for(int i=0; i<s1.length; i++){
            String word = s1[i];
            int numIdx = word.length()-1; 
            int pos = word.charAt(numIdx) - '0';

            String sub = word.substring(0,numIdx);

            arr[pos-1] = sub;
        }

        return String.join(" ", arr);
    }
}