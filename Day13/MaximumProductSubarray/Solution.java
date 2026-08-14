class Solution {
    public int maxProduct(int[] nums) {
        int maxProd = nums[0];
        int minProd = nums[0];
        int res = nums[0];

        for(int i=1; i<nums.length; i++){
            int current = nums[i];
            if(current<0){
                int temp = maxProd;
                maxProd = minProd;
                minProd = temp;
            }

            maxProd = Math.max(current,maxProd*current);
            minProd = Math.min(current,minProd*current);

            res = Math.max(res,maxProd);
        }

        return res;

    }
}