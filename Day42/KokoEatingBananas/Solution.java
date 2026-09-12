class Solution {

    public int minEatingSpeed(int[] piles, int h) {

        int low = 1;
        int high = 0;

        for (int pile : piles) {
            high = Math.max(high, pile);
        }

        int answer = high;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (isPossible(piles, h, mid)) {
                answer = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return answer;
    }

    public boolean isPossible(int[] piles, int h, int speed) {

        long hours = 0;   

        for (int pile : piles) {
            hours += (pile + (long)speed - 1) / speed; // ceiling 
        }

        return hours <= h;
    }
}