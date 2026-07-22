class RunningSum {
    public int[] runningSum(int[] nums) {
        int[] runningSum = new int[nums.length];
        for(int i = 0; i<nums.length; i++){
            runningSum[i] = 0;
            for(int j = 0; j<=i; j++){
                runningSum[i] = nums[j] + runningSum[i];
            }
        }
        return runningSum;
    }
}