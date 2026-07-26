class MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int maxConsecutive = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==1){
                count++;
                if(count>maxConsecutive){
                    maxConsecutive = count;
                }
            }
            else{
                count = 0;
            }
        }
        return maxConsecutive;
    }
}