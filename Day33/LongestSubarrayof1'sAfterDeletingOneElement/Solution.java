class Solution {
    public int longestSubarray(int[] nums) {
        int l=0; int r=0; 
        int zeroCount=0; int max=0;
        int n=nums.length;

        while(r<n){
            if(nums[r] == 0){
                zeroCount++;
            }
            while(zeroCount > 1){
                if(nums[l] == 0){
                    zeroCount--;
                }
                l++;
            }       
            max = Math.max(max,r-l);
            r++;
        }
        return max;
    }
}