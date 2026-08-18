class Solution {
    public int mySqrt(int x) {
        long start = 0;
        long end = x;
        while(start<=end){
            long mid = start + (end-start) / 2;
            if(mid * mid == x){
                return (int) mid;
            }else if(mid * mid > x){
                end = (int) mid - 1;
            }else{
                start = (int) mid + 1;
            }
        }
        return (int) end;
    }
}