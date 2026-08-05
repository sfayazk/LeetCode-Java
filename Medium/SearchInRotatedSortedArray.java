class SearchInRotatedSortedArray {
    public int search(int[] nums, int target) {
        int pivot = findPivotElement(nums);
        int firstTry = binarySearch(nums, target, 0, pivot);
        if(firstTry!=-1){
            return firstTry;
        }
        return binarySearch(nums, target, pivot+1, nums.length-1);
    }

     public static int findPivotElement(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if(mid<end && nums[mid]>nums[mid+1]){
                return mid;
            }else if(mid>start && nums[mid]<nums[mid-1]){
                return mid-1;
            }else if(nums[start]>nums[mid]){
                end = mid -1;
            }else{
                start = mid+1;
            }
        }
        return -1;
    }


     public static int binarySearch(int[] arr, int target, int start, int end){
        while(start<=end){
            int mid = start + (end-start) / 2;
            if(target==arr[mid]){
                return mid;
            }

            if (target > arr[mid]) {
                start = mid + 1;
            }else {
                end = mid - 1;
            }
 
        }
        return -1;
    }
}