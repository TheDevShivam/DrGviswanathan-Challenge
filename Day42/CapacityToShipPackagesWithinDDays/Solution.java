class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low = 1;
        int high = 0;

        for(int weight : weights){
            low = Math.max(low,weight);
            high += weight;
        }

        int ans = high;

        while(low<=high){
            int mid = low + (high - low) / 2;

            if (isPossible(weights, days, mid)) {
                ans = mid;
                high = mid-1;
            } else {
                low = mid +1;
            }
        }

        return ans;
    }

    public boolean isPossible(int[] weights, int days, int capacity) {

        int currentWeight = 0;
        int daysUsed = 1;  

        for (int i : weights) {
            if(currentWeight + i > capacity) {
                daysUsed++;
                currentWeight = i;
            } else {
                currentWeight += i;
            }
        }

        return daysUsed <= days;
    }
}