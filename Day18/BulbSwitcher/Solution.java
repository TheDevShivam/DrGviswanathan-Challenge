class Solution {
    public int bulbSwitch(int n) {
        int nums = 0;
        for(int i=1; i*i<=n; i++){
           nums++;
        }

        return nums;
    }
}