class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if((long)m*k>bloomDay.length) return -1;

        int low=Integer.MAX_VALUE;
        int high=Integer.MIN_VALUE;

        for (int i: bloomDay) {
            low=Math.min(i,low);
            high = Math.max(i,high);
        }

        int answer = high;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (isPossible(bloomDay, m, k, mid)) {
                answer = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return answer;
    }

    public boolean isPossible(int[] bloomDay,int m, int k, int day) {
            int flowers = 0;
            int bouquets = 0;

            for(int i: bloomDay){
                if(i<=day){
                    flowers++;
                }else{
                    flowers = 0;
                }
                if(flowers == k){
                    bouquets++;
                    flowers = 0;
                }
            }

            return bouquets >= m;
        }
}