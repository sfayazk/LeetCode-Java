class Solution {
    public int thirdMax(int[] nums) {
        int max1 = 0;
        int max2 = 0;
        int max3 = 0;
        
        for(int i=0; i<nums.length; i++){  
            if(max1<nums[i]){
                int temp1 = max1; 
                int temp2 = max2;
                max1 = nums[i];
                max2 = temp1;
                max3 = temp2;
            }else if(max1>nums[i] && max2<nums[i]){
                int temp2 = max2;
                max2 = nums[i];
                max3 = temp2;
            }else if(max1>nums[i] && max2>nums[i] && max3<nums[i]){
                max3 = nums[i];
            }
        }
        if(nums.length<3){
            return max1;
        }
            return max3;
    }
}