class SquaresOfSortedArray {
    public int[] sortedSquares(int[] nums) {
        // squares of an array
        for(int i=0; i<nums.length; i++){
            nums[i] *= nums[i];
        }
        // sorting the squared array
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i]>nums[j]){
                    int temp = nums[j];
                    nums[j] = nums[i];
                    nums[i] = temp;
                }
            }
        }
        return nums;
    }
}