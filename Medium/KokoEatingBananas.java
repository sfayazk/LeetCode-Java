class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int start = 1;
        int end = 0;
        for(int i = 0; i<piles.length; i++){
            end = Math.max(end, piles[i]);
        }
        while(start<=end){
            long hoursTaken = 0;
            int mid = start + (end-start)/2;
            for(int i=0; i<piles.length; i++){
                hoursTaken += (piles[i] + mid - 1) / mid;
            }
            if(hoursTaken>h){
                start = mid + 1;
            }else {
                end = mid - 1;
            }
        }
        return start;
    }
}
