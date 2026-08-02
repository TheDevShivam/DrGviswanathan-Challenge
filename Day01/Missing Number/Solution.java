
public class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int e_sum = n * (n+1) / 2;
        int a_sum = 0;

        
        for(int num : nums){
            a_sum += num;
        }

        return e_sum-a_sum;
    }
}
