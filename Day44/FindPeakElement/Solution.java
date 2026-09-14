class Solution {
    public int findPeakElement(int[] nums) {
        int i = 0;
        int j = nums.length - 1;
        
        while(i<=j){
            int mid = (i+j)/2;

            if(isPeakElement(nums,mid)){
                return mid;
                
            }else if(nums[mid+1]>nums[mid]){
                i = mid+1;
            }else{
                j = mid-1;
            }
        }
        return -1;
    }

    public boolean isPeakElement(int[] nums,int k){

        if (nums.length == 1) {
            return true;
        }

        if (k == 0) {
            return nums[k] > nums[k + 1];
        }

        if (k == nums.length - 1) {
            return nums[k] > nums[k - 1];
        }

        if(nums[k]>nums[k-1] && nums[k]>nums[k+1]){
            return true;
        }

        return false;
    }
   
}