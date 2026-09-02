class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int l=0; int r=minutes-1;
        int nG=0;
        for(int i=0;i<customers.length;i++){
            if(grumpy[i] == 0){
                nG = nG + customers[i];
            }
        }
        
        int sum = 0;
        for(int i=0; i<minutes ; i++){
            if(grumpy[i] == 1){
                sum += customers[i];
            }
        }
        int max = sum;

        while(r<grumpy.length-1){
            if(grumpy[l] == 1){
                sum = sum - customers[l];
            }
            l++;
            r++;
            if(grumpy[r] == 1){
                sum = sum + customers[r];
            }

            max = Math.max(max, sum);
        } 

        return max + nG;
    }
}