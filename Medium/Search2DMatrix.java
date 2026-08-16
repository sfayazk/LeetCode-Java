class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        int rows = matrix.length;
        int cols = matrix[0].length;
        if (rows == 1) {
            return binarySearch(matrix, 0, 0, cols - 1, target);
        }

        int rStart = 0;
        int rEnd = matrix.length - 1;
        int cMid = (cols-1) / 2;

        while (rStart < rEnd - 1) {
            int rMid = rStart + (rEnd - rStart) / 2;
            if (target == matrix[rMid][cMid]) {
                return true;
            }
            if (target > matrix[rMid][cMid]) {
                rStart = rMid;
            }
            if (target < matrix[rMid][cMid]) {
                rEnd = rMid;
            }
        }
        // Run the above loop until there is 2 rows left.

        // To check whether the target is in the column.
        if (target == matrix[rStart][cMid]) {
            return true;
        }
        if (target == matrix[rEnd][cMid]) {
            return true;
        }

        // Check the remaining four parts of the 2 rows.
        if (cMid>0 && target <= matrix[rStart][cMid - 1]) {
            return binarySearch(matrix, rStart, 0, cMid - 1, target);
        }
        if (cols > 1 && target >= matrix[rStart][cMid + 1] && target <= matrix[rStart][cols - 1]) {
            return binarySearch(matrix, rStart, cMid + 1, cols - 1, target);
        }
        if (cMid>0 && target <= matrix[rEnd][cMid - 1]) {
            return binarySearch(matrix, rEnd, 0, cMid - 1, target);
        } else {
            return binarySearch(matrix, rEnd, cMid + 1, cols - 1, target);
        }
    }

    public boolean binarySearch(int[][] matrix, int row, int cStart, int cEnd, int target) {
        while (cStart <= cEnd) {
            int mid = cStart + (cEnd - cStart) / 2;
            if (target == matrix[row][mid]) {
                return true;
            }
            if (target > matrix[row][mid]) {
                cStart = mid + 1;
            } else {
                cEnd = mid - 1;
            }
        }
        return false;
    }
}