class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] indices = new int[2];
        for(int i = 0; i<nums.length; i++){
            for(int j = i+1; j<nums.length; j++){   // j = i + 1, because to avoid taking the same element twice
                if(nums[i]+nums[j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }
}

/*
Why j = i + 1?

✅ Prevents comparing an element with itself.
✅ Avoids checking duplicate pairs.
✅ Reduces unnecessary comparisons.
 */