class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return func(nums,k) - func(nums,k-1);
    }

    public int func(int[] nums, int k){
        if(k<0) return 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        int l=0; int r=0; int count=0;

        while(r<nums.length){
            map.put(nums[r],map.getOrDefault(nums[r],0)+1);
            
            while(map.size()>k){
                
                if(map.get(nums[l]) == 1){
                    map.remove(nums[l]);
                }else{
                    map.put(nums[l],map.get(nums[l])-1);
                }
                
                l++;
            }

            count += r-l+1;
            r++;
        }

        return count;
    }
}