class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix[0].length == 1) {
            int c = 0;
            while(c < matrix.length) {
                if (matrix[c][0] == target){
                    return true;
                }
                c++;
            }
            return false;
        }

        int should_be_in_row = 0,c = 0, l=0;
        for (int row = 0; row< matrix.length; row++) {
            if (target >= matrix[row][0] && target <= matrix[row][matrix[row].length -1]){
                should_be_in_row = row;
                break;
            }
        }

        int r = matrix[should_be_in_row].length -1;
        
        //System.out.println(should_be_in_row);
        while(l <= r) {
            int mid = l+(r-l)/2;
            if (matrix[should_be_in_row][mid] == target) {
                return true;
            }
            else if (matrix[should_be_in_row][mid] > target) {
                r = mid -1;
            }
            else {
                l = mid+1;
            }
        }
        return false;
    }
}
