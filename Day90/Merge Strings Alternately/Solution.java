class Solution {
    public String mergeAlternately(String word1, String word2) {
        int n1 = word1.length();
        int n2 = word2.length();

        char[] arr = new char[n1+n2];
        int i=0;
        int j=0;
        while(j<n1 && j<n2){
            arr[i] = word1.charAt(j);
            arr[i+1] = word2.charAt(j);
            i = i+2;
            j++;
        }
        while (j < n1) {
            arr[i++] = word1.charAt(j++);
        }

        while (j < n2) {
            arr[i++] = word2.charAt(j++);
        }

        return new String(arr);
    }
}