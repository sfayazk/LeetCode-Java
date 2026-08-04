package Hard;

/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */

public class FindInMountainArray {
        public int findInMountainArray(int target, MountainArray mountainArr) {
        return search(mountainArr, target);
    }
    //Finding Peak element index
    public static int findPeakElement(MountainArray mountainArr) {
        int start = 0;
        int end = mountainArr.length()-1;
        while(start<end){
            int mid = start + (end-start) / 2;
            int midValue = mountainArr.get(mid);
            int nextValue = mountainArr.get(mid + 1);
            if(midValue>nextValue){
                end = mid;
            }
            else if (midValue<nextValue){
                start = mid + 1;
            }
        }
        return start;
    }


    // Searching for the element
    public static int search(MountainArray mountainArr, int target){
        int peak = findPeakElement(mountainArr);
        int firstTry = orderAgnosticBS(mountainArr, target, 0, peak);
        if(firstTry!=-1){
            return firstTry;
        }
        return orderAgnosticBS(mountainArr, target, peak+1, mountainArr.length()-1);
    }

    public static int orderAgnosticBS(MountainArray mountainArr, int target, int start, int end) {
        // check the array is ascending or descending.
        boolean isAsc = mountainArr.get(start) < mountainArr.get(end);
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int midValue = mountainArr.get(mid);
            if (target == midValue) {
                return mid;
            }
            if (isAsc) {
                if (target > midValue) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                if (target < midValue) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}
