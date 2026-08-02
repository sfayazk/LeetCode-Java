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