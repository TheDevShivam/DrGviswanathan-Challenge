class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int i=0; int j=n-1;

        while(i<j){
            int mid= i + (j-i)/2;
            
            if(nums[mid]>nums[j]){
                i = mid+1;
            }else{
                j = mid;
            }
        }
        j = n-1;
        int i2=0; int j2=i-1;

        while(i2<=j2){
            int mid = i2+(j2-i2)/2;

            if(target==nums[mid]){
                return mid;
            }else if(nums[mid]>target){
                j2 = mid-1;
            }else{
                i2 = mid+1;
            }
        }

        while(i<=j){
            int mid = i+(j-i)/2;

            if(target==nums[mid]){
                return mid;
            }else if(nums[mid]>target){
                j = mid-1;
            }else{
                i = mid+1;
            }
        }

        return -1;
    }
}