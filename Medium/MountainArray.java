// Brute Force Approach

class MountainArray {
    public int peakIndexInMountainArray(int[] arr) {
        int index = 0;
        int i = 0;
        while(arr[i]<arr[i+1]){
            index = i + 1;
            i++;
        }
        return index;
    }
}

// Optimized solution

class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            int mid = start + (end-start) / 2;
            if(arr[mid]>arr[mid+1]){
                end = mid;
            }
            else if (arr[mid]<arr[mid+1]){
                start = mid + 1;
            }
        }
            return start;
    }
}