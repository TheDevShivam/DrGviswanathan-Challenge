class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        int i=0; int j=n-1;

        while(i<=j){
            if(nums[i] <= nums[j]) {
                return nums[i];
            }
            int mid= i + (j-i)/2;
            int next = (mid+1)%n;
            int prev = (mid+n-1)%n;

            if(nums[mid]<=nums[prev] && nums[mid]<=nums[next]){
                return nums[mid];
            }else if(nums[i]<=nums[mid]){
                i = mid+1;
            }else{
                j = mid-1;
            }
        }

        return -1;
    }
}