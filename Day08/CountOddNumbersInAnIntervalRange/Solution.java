public class Solution {
    public int countOdds(int low, int high) {
        int total = high - low +1;

        int ans;
        if(low%2 == 1 && high%2 == 1){
            ans = total / 2 + 1;
        }else{
            ans = total/2;
        }
        return ans;
    }
}