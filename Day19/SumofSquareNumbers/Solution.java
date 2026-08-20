class Solution {
    public boolean judgeSquareSum(int c) {
        
        for(long i=0; i*i<=c; i++){
            long a = c - (i*i);
            long root = (long)Math.sqrt(a);
            if(root*root == a){
                return true;
            }
        }

        return false;
    }
}