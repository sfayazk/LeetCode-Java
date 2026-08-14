class Solution {
    public int findMin(int[] nums) {
        int start = 0;
        int end = nums.length-1;
        if(nums[start]<nums[end] || end == 0){
            return nums[0];
        }
        while(start<=end){
            int mid = start + (end-start)/2;
            if(mid<end && nums[mid] > nums[mid+1]){
                return nums[mid+1];
            }else if(start<mid && nums[mid-1]>nums[mid]){
                return nums[mid];
            }else if(nums[start]>nums[mid]){
                end = mid - 1;
            }else if(nums[start]<nums[mid]){
                start = mid + 1;
            }
        }
        return -1;
    }
}